package xyz.cssxsh.leetcode.editor.cn

object No0053MaximumSubarray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxSubArray(nums: IntArray): Int {
            if (nums.size == 1) return nums[0]

            var min = 0
            var max = nums[0]
            var sum = 0

            for (num in nums) {
                sum += num

                max = maxOf(sum - min, max)
                min = minOf(sum, min)
            }

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}