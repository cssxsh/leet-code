package xyz.cssxsh.leetcode.editor.cn

object No0062UniquePaths {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun uniquePaths(m: Int, n: Int): Int {
            val dp = Array(size = m) { IntArray(size = n) }

            dp[0][0] = 1
            for (i in 1 until n) dp[0][i] = 1

            for (j in 1 until m) {
                dp[j][0] = 1
                for (i in 1 until n) {
                    dp[j][i] = dp[j - 1][i] + dp[j][i - 1]
                }
            }

            return dp[m - 1][n - 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}