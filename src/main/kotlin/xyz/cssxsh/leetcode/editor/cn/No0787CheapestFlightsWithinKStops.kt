package xyz.cssxsh.leetcode.editor.cn

object No0787CheapestFlightsWithinKStops {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
            val dp = IntArray(size = n) { PRICE_LIMIT }
            dp[src] = 0

            var result = PRICE_LIMIT
            var i = k + 1
            while (i-- > 0) {
                val prev = dp.clone()
                for ((from, to, price) in flights) {
                    dp[to] = minOf(prev[from] + price, dp[to])
                }
                result = minOf(result, dp[dst])
            }

            return if (result == PRICE_LIMIT) -1 else result
        }

        companion object {
            private const val PRICE_LIMIT = 1_0000 * 101 + 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}