package xyz.cssxsh.leetcode.editor.cn

object No1969MinimumNonZeroProductOfTheArrayElements {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minNonZeroProduct(p: Int): Int {
            if (p == 1) return 1
            // (2 ^ p - 1) * (2 ^ p - 2) ^ (2 ^ (p - 1) - 1)

            val x = pow(x = 2, n = p.toLong()) - 1
            val y = pow(x = x - 1, n = (1L shl (p - 1)) - 1L)

            println("$x, $y")

            return (x * y % MOD).toInt()
        }

        /**
         * [快速幂](https://oi-wiki.org/math/binary-exponentiation/)
         */
        private fun pow(x: Long, n: Long): Long {
            var result = 1L
            var s = x
            var i = n
            while (i != 0L) {
                if (i and 1L != 0L) result = result * s % MOD
                s = s * s % MOD
                i = i shr 1
            }

            return result
        }

        companion object {
            private const val MOD = 1_000_000_007L
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}