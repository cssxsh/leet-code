package xyz.cssxsh.leetcode.editor.cn

object No0045JumpGameIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun jump(nums: IntArray): Int {
            val n = nums.size
            var steps = 0
            var max = 0
            var end = 0
            for (i in 0 .. n - 2) {
                max = maxOf(i + nums[i], max)
                if (i == end) {
                    end = max
                    steps++
                }
            }

            return steps
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}