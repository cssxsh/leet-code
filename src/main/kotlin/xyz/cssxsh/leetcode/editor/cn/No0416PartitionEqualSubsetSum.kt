package xyz.cssxsh.leetcode.editor.cn

object No0416PartitionEqualSubsetSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun canPartition(nums: IntArray): Boolean {
            val sum = nums.sum()
            if (sum % 2 == 1) return false
            val target = sum / 2
            val dp = BooleanArray(size = target + 1)
            dp[0] = true

            for (num in nums) {
                for (i in target downTo num) {
                    dp[i] = dp[i] || dp[i - num]
                }
            }

            return dp[target]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}