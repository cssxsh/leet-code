package xyz.cssxsh.leetcode.editor.cn

object No0075SortColors {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun sortColors(nums: IntArray) {
            var i = 0
            var j = 0
            var k = 0
            while (i < nums.size) {
                when (nums[i]) {
                    0 -> {
                        nums[i++] = 2
                        nums[j++] = 1
                        nums[k++] = 0
                    }
                    1 -> {
                        nums[i++] = 2
                        nums[j++] = 1
                    }
                    2 -> {
                        nums[i++] = 2
                    }
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
