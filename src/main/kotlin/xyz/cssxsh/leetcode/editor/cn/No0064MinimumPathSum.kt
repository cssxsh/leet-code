package xyz.cssxsh.leetcode.editor.cn

object No0064MinimumPathSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minPathSum(grid: Array<IntArray>): Int {
            val m = grid.size
            val n = grid[0].size

            val dp = Array(size = m) { IntArray(size = n) }

            dp[0][0] = grid[0][0]
            for (i in 1 until n) dp[0][i] = grid[0][i] + dp[0][i - 1]

            for (j in 1 until m) {
                dp[j][0] = grid[j][0] + dp[j - 1][0]
                for (i in 1 until n) {
                    dp[j][i] = grid[j][i] + minOf(dp[j - 1][i], dp[j][i - 1])
                }
            }

            return dp[m - 1][n - 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}