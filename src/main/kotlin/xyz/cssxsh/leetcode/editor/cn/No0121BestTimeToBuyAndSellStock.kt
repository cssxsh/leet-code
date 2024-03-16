package xyz.cssxsh.leetcode.editor.cn

object No0121BestTimeToBuyAndSellStock {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxProfit(prices: IntArray): Int {
            var min = prices[0]
            var profit = 0

            for (day in 1 until prices.size) {
                val price = prices[day]
                profit = maxOf(price - min, profit)
                min = minOf(price, min)
            }

            return profit
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}