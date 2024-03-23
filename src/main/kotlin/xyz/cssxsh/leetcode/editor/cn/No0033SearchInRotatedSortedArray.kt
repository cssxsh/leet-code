package xyz.cssxsh.leetcode.editor.cn

object No0033SearchInRotatedSortedArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            val n = nums.size

            var left = 0
            var right = n - 1
            val k = if (nums[0] < nums[n - 1]) {
                0
            } else {
                while (left < right) {
                    val mid = (left + right) / 2
                    val value = nums[mid]

                    if (value > nums[left]) {
                        left = mid
                    } else {
                        right = mid
                    }
                }
                n - left - 1
            }

            left = 0
            right = n - 1
            while (left <= right) {
                val mid = (left + right) / 2
                val index = (mid + n - k) % n
                val value = nums[index]
                if (value == target) return index

                if (value < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }

            return -1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}