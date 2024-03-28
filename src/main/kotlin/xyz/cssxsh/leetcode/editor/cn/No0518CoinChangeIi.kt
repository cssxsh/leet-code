package xyz.cssxsh.leetcode.editor.cn

object No0518CoinChangeIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun change(amount: Int, coins: IntArray): Int {
            val dp = IntArray(size = amount + 1)
            dp[0] = 1
            for (coin in coins) {
                for (i in coin .. amount) {
                    dp[i] += dp[i - coin]
                }
            }
            return dp[amount]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}