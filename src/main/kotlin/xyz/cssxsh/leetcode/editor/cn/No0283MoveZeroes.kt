package xyz.cssxsh.leetcode.editor.cn

object No0283MoveZeroes {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun moveZeroes(nums: IntArray) {
            if (nums.size < 2) return

            var i = 0
            var z = 0
            while (true) {
                if (nums[i] == 0) {
                    z++
                } else if (z != 0) {
                    nums[i - z] = nums[i]
                    nums[i] = 0
                }
                i++
                if (i >= nums.size) break
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}