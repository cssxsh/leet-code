package xyz.cssxsh.leetcode.editor.cn

object No0005LongestPalindromicSubstring {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestPalindrome(s: String): String {
            val buffer = StringBuilder()
            buffer.append('#')
            for (char in s) buffer.append(char).append('#')

            var start = 0
            var end = -1
            val arms = IntArray(size = buffer.length)
            var right = -1
            var j = -1
            for (i in buffer.indices) {
                val arm = if (right >= i) {
                    val min = minOf(arms[j * 2 - i], right - i)
                    buffer.expand(left = i - min, right = i + min)
                } else {
                    buffer.expand(left = i, right = i)
                }
                arms[i] = arm
                if (i + arm > right) {
                    j = i
                    right = i + arm
                }
                if (arm * 2 + 1 > end - start) {
                    start = i - arm
                    end = i + arm
                }
            }

            buffer.delete(0, start)
            buffer.delete(end + 1 - start, buffer.length)
            var i = 0
            while (i < buffer.length) buffer.deleteCharAt(i++)

            return buffer.toString()
        }

        private fun CharSequence.expand(left: Int, right: Int): Int {
            var i = left
            var j = right
            while (i >= 0 && j < length && get(i) == get(j)) {
                i--
                j++
            }

            return (j - i - 2) / 2
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}