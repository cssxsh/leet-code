package xyz.cssxsh.leetcode.editor.cn

object No0718MaximumLengthOfRepeatedSubarray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findLength(nums1: IntArray, nums2: IntArray): Int {
            val m = nums1.size
            val n = nums2.size

            val dp = Array(size = m) { IntArray(size = n) { 0 } }
            var max = 0

            var last = nums2[n - 1]
            for (j in 0 until m) {
                val current = if (nums1[j] == last) 1 else 0
                dp[j][n - 1] = current
                max = maxOf(current, max)
            }
            last = nums1[m - 1]
            for (i in 0 until n) {
                val current = if (last == nums2[i]) 1 else 0
                dp[m - 1][i] = current
                max = maxOf(current, max)
            }

            for (j in m - 2 downTo 0) {
                for (i in n - 2 downTo 0) {
                    val current = if (nums1[j] == nums2[i]) dp[j + 1][i + 1] + 1 else 0
                    dp[j][i] = current
                    max = maxOf(current, max)
                }
            }

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}