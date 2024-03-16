package xyz.cssxsh.leetcode.editor.cn

object No0198HouseRobber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun rob(nums: IntArray): Int {
            if (nums.size == 1) return nums[0]

            var a = nums[0]
            var b = maxOf(nums[0], nums[1])
            for (i in 2 until nums.size) {
                val t = b
                b = maxOf(nums[i] + a, b)
                a = t
            }
            return b
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}