package xyz.cssxsh.leetcode.editor.cn

object No0402RemoveKDigits {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun removeKdigits(num: String, k: Int): String {
            val buffer = StringBuilder(num)

            var j = k
            var i = 0
            delete@ while (j-- > 0) {
                val n = buffer.length - 1
                while (i < n && buffer[i] <= buffer[i + 1]) i++
                buffer.deleteCharAt(i)
                i = (i - 1).coerceAtLeast(0)
            }

            while (buffer.length > 1 && buffer[0] == '0') buffer.deleteCharAt(0)

            return buffer.toString().ifEmpty { "0" }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}