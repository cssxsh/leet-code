package xyz.cssxsh.leetcode.editor.cn

object No1760MinimumLimitOfBallsInABag {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minimumSize(nums: IntArray, maxOperations: Int): Int {
            var left = 1
            var right = nums.max()
            var result = 0
            while (left <= right) {
                val mid = (left + right) / 2
                var operations = 0
                for (num in nums) {
                    operations += (num - 1) / mid
                }
                if (operations <= maxOperations) {
                    result = mid
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}