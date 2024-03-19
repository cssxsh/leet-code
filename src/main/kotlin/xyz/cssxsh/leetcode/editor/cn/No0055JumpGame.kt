package xyz.cssxsh.leetcode.editor.cn

object No0055JumpGame {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun canJump(nums: IntArray): Boolean {
            val n = nums.size

            var min = 1
            for (i in (0 .. n - 2).reversed()) {
                min = if (nums[i] >= min) 1 else min + 1
            }

//            var i = 0
//            while (i < n - 1) {
//                val num = nums[i]
//                if (num == 0) break
//                var max = i
//                var j = 0
//                for (x in 1 .. num) {
//                    if (i + x >= n) continue
//                    if (i + x + nums[i + x] > max) {
//                        max = i + x + nums[i + x]
//                        j = x
//                    }
//                }
//                i += j
//            }

            return min == 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}