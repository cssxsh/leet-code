package xyz.cssxsh.leetcode.editor.cn

object No0238ProductOfArrayExceptSelf {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun productExceptSelf(nums: IntArray): IntArray {
            val n = nums.size
            val left = IntArray(size = n) { 1 }
            val right = IntArray(size = n) { 1 }
            val result = IntArray(size = n) { 1 }

            for (i in 1 until n) left[i] = left[i - 1] * nums[i - 1]
            for (i in n - 2 downTo 0) right[i] = right[i + 1] * nums[i + 1]
            for (i in 0 until n) result[i] = left[i] * right[i]

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}