package xyz.cssxsh.leetcode.editor.cn

object No0409LongestPalindrome {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestPalindrome(s: String): Int {
            var result = 0
            val counts = IntArray(size = 'z' - 'A' + 1)
            for (char in s) counts[char - 'A']++

            for (char in 'A' .. 'z') {
                val count = counts[char - 'A']
                result += count and 2046
                counts[char - 'A'] = count and 1
            }

            for (char in 'A' .. 'z') {
                val count = counts[char - 'A']
                if (count == 1) {
                    result++
                    break
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}