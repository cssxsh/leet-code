package xyz.cssxsh.leetcode.editor.cn

object No0313SuperUglyNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
            if (n == 1) return 1
            val k = primes.size

            val dp = IntArray(size = n)
            dp[0] = 1

            val a = IntArray(size = k)
            for (i in 1 until n) {
                val x = LongArray(size = k) { 1L * dp[a[it]] * primes[it] }

                val next = x.min()
                for (j in 0 until k) {
                    if (next == x[j]) a[j]++
                }

                dp[i] = next.toInt()
            }

            return dp[n - 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}