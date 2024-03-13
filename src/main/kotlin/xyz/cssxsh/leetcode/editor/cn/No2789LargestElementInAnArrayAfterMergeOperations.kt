package xyz.cssxsh.leetcode.editor.cn

class No2789LargestElementInAnArrayAfterMergeOperations {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxArrayValue(nums: IntArray): Long {
            var i = nums.size - 1
            var max = nums[i].toLong()
            while (i-- > 0) {
                if (nums[i] <= max) {
                    max += nums[i].toLong()
                } else {
                    max = nums[i].toLong()
                }
            }
            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}