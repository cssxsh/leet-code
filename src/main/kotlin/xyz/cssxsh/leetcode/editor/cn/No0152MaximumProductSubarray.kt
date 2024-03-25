package xyz.cssxsh.leetcode.editor.cn

object No0152MaximumProductSubarray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxProduct(nums: IntArray): Int {
            val n = nums.size
            if (n == 1) return nums[0]

            var result = nums[0]
            var max = nums[0]
            var min = nums[0]

            for (i in 1 until n) {
                val num = nums[i]
                val a = max * num
                val b = min * num
                max = maxOf(a, b, num)
                min = minOf(a, b, num)
                result = maxOf(max, result)
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}