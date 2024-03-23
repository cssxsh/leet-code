package xyz.cssxsh.leetcode.editor.cn

object No0034FindFirstAndLastPositionOfElementInSortedArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun searchRange(nums: IntArray, target: Int): IntArray {
            val n = nums.size
            if (n == 0) return intArrayOf(-1, -1)
            if (nums[0] > target) return intArrayOf(-1, -1)
            if (nums[n - 1] < target) return intArrayOf(-1, -1)

            var left = 0
            var right = n - 1

            val prev = target - 0.5
            while (left <= right) {
                val mid = (left + right) / 2
                val value = nums[mid]

                if (value < prev) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            if (nums[left] != target) return intArrayOf(-1, -1)
            val l = left

            val next = target + 0.5
            left = 0
            right = n - 1
            while (left <= right) {
                val mid = (left + right) / 2
                val value = nums[mid]

                if (value < next) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            if (nums[right] != target) return intArrayOf(-1, -1)
            val r = right

            return intArrayOf(l, r)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}