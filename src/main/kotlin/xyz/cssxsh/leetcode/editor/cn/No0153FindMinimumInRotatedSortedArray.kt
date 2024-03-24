package xyz.cssxsh.leetcode.editor.cn

object No0153FindMinimumInRotatedSortedArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findMin(nums: IntArray): Int {
            val n = nums.size
            if (n == 1 || nums[0] < nums[n - 1]) return nums[0]

            var left = 0
            var right = n - 1
            while (left < right) {
                val mid = (left + right) / 2
                val value = nums[mid]

                if (value > nums[left]) {
                    left = mid
                } else {
                    right = mid
                }
            }

            return nums[left + 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}