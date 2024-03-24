package xyz.cssxsh.leetcode.editor.cn

object No0009PalindromeNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            if (x < 0) return false
            var a = x
            var b = 0
            while (a != 0) {
                b *= 10
                b += a % 10
                a /= 10
            }

            return b == x
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}