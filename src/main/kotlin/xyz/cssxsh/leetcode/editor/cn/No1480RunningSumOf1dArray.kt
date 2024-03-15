package xyz.cssxsh.leetcode.editor.cn

object No1480RunningSumOf1dArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun runningSum(nums: IntArray): IntArray {
            var sum = 0
            nums.forEachIndexed { i, num ->
                sum += num
                nums[i] = sum
            }

            return nums
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}