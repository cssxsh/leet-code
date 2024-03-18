package xyz.cssxsh.leetcode.editor.cn

object No0581ShortestUnsortedContinuousSubarray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findUnsortedSubarray(nums: IntArray): Int {
            val n = nums.size

            val min = nums.clone()
            val max = nums.clone()

            for (i in 1 until n) {
                max[i] = maxOf(max[i - 1], nums[i])
                min[n - i - 1] = minOf(min[n - i], nums[n - i - 1])
            }

            val start = (0 until n).find { min[it] != nums[it] } ?: n
            val end = (start until n).reversed().find { max[it] != nums[it] } ?: (n - 1)

            return end - start + 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}