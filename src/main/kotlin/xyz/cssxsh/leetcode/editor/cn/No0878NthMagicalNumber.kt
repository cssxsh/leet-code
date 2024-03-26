package xyz.cssxsh.leetcode.editor.cn

object No0878NthMagicalNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [容斥原理](https://oi-wiki.org/math/combinatorics/inclusion-exclusion-principle/)
         */
        fun nthMagicalNumber(n: Int, a: Int, b: Int): Int {
            val ab = lcm(a = a, b = b)
            var left = 0L
            var right = 1L * minOf(a, b) * n + 1
            while (left + 1 < right) {
                val mid = left + (right - left) / 2
                val count = mid / a + mid / b - mid / ab
                if (count < n) {
                    left = mid
                } else {
                    right = mid
                }
            }

            return (right % 10_0000_0007).toInt()
        }

        private fun lcm(a: Int, b: Int): Int = a / gcd(a = a, b = b) * b

        private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(a = b, b = a % b)
    }
    //leetcode submit region end(Prohibit modification and deletion)
}