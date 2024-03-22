package xyz.cssxsh.leetcode.editor.cn

object No0035SearchInsertPosition {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun searchInsert(nums: IntArray, target: Int): Int {
            val n = nums.size

            var left = 0
            var right = n - 1
            while (left <= right) {
                val mid = (left + right) / 2
                val num = nums[mid]
                if (num == target) return mid
                if (num < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }

            return left
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}