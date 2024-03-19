package xyz.cssxsh.leetcode.editor.cn

object No1793MaximumScoreOfAGoodSubarray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maximumScore(nums: IntArray, k: Int): Int {
            val n = nums.size

            var max = nums[k]
            var i = k
            var left = nums[i]
            var j = k
            var right = nums[j]
            while (j - i + 1 < n) {
                left = if (i - 1 >= 0) minOf(nums[i - 1], left) else Int.MIN_VALUE
                right = if (j + 1 < n) minOf(nums[j + 1], right) else Int.MIN_VALUE
                val h = maxOf(left, right)
                if (left == h) i--
                if (right == h) j++

                max = maxOf(h * (j - i + 1), max)
            }

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}