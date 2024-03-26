package xyz.cssxsh.leetcode.editor.cn

object No0125ValidPalindrome {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(s: String): Boolean {
            val n = s.length
            var i = 0
            var j = n - 1

            while (i < j) {
                var a = s[i]
                while (a.isNumbersOrLetter().not() && i + 1 < n) a = s[++i]
                var b = s[j]
                while (b.isNumbersOrLetter().not() && j - 0 > 0) b = s[--j]

                if (i <= j && a.lowercaseChar() != b.lowercaseChar()) return false

                i++
                j--
            }

            return true
        }

        private fun Char.isNumbersOrLetter(): Boolean {
            return this in '0' .. '9' ||
                this in 'a' .. 'z' ||
                this in 'A' .. 'Z'
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}