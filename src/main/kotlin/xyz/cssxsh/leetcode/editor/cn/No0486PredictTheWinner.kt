package xyz.cssxsh.leetcode.editor.cn

object No0486PredictTheWinner {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun predictTheWinner(nums: IntArray): Boolean {
            val n = nums.size
            val dp = nums.clone()

            for (j in n - 2 downTo 0) {
                for (i in j + 1 until n) {
                    dp[i] = maxOf(nums[j] - dp[i], nums[i] - dp[i - 1])
                }
            }

            return dp[n - 1] >= 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}