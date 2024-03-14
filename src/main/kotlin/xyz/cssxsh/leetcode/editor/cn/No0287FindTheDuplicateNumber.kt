package xyz.cssxsh.leetcode.editor.cn

object No0287FindTheDuplicateNumber {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findDuplicate(nums: IntArray): Int {
            var i = 0
            var j = 0
            while (true) {
                i = nums[i]
                j = nums[nums[j]]
                if (j == i) break
            }
            i = 0
            while (true) {
                if (j == i) break
                i = nums[i]
                j = nums[j]
            }

            return i
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}