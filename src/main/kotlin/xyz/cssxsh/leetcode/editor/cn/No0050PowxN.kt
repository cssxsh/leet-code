package xyz.cssxsh.leetcode.editor.cn

object No0050PowxN {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun myPow(x: Double, n: Int): Double {
            return when (n) {
                in 0 .. Int.MAX_VALUE -> pow(x = x, n = n)
                Int.MIN_VALUE -> pow(x = 1 / x, n = Int.MAX_VALUE) / x
                else -> pow(x = 1 / x, n = -n)
            }
        }

        /**
         * [快速幂](https://oi-wiki.org/math/binary-exponentiation/)
         */
        private fun pow(x: Double, n: Int): Double {
            var result = 1.0
            var s = x
            var i = n
            while (i != 0) {
                if (i and 1 != 0) result *= s
                s *= s
                i = i shr 1
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}