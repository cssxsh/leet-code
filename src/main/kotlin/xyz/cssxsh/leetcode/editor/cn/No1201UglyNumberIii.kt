package xyz.cssxsh.leetcode.editor.cn

object No1201UglyNumberIii {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [容斥原理](https://oi-wiki.org/math/combinatorics/inclusion-exclusion-principle/)
         */
        fun nthUglyNumber(n: Int, a: Int, b: Int, c: Int): Int {
            val ab = lcm(a = a, b = b)
            val bc = lcm(a = b, b = c)
            val ac = lcm(a = a, b = c)
            val abc = lcm(a = a, b = bc)
            var left = 0
            var right = 20_0000_0000
            while (left + 1 < right) {
                val mid = left + (right - left) / 2
                val count = mid / a + mid / b + mid / c - mid / ab - mid / bc - mid / ac + mid / abc
                if (count < n) {
                    left = mid
                } else {
                    right = mid
                }
            }

            return right
        }

        private fun lcm(a: Int, b: Int): Int {
            return (1L * a / gcd(a = a, b = b) * b).coerceAtMost(2147483647).toInt()
        }

        private fun gcd(a: Int, b: Int): Int {
            return if (b == 0) a else gcd(a = b, b = a % b)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}