package xyz.cssxsh.leetcode.editor.cn

object No0215KthLargestElementInAnArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findKthLargest(nums: IntArray, k: Int): Int {
            val buckets = IntArray(size = 20001)
            for (num in nums) buckets[num + 10000]++

            var n = k
            for (i in 20000 downTo 0) {
                n -= buckets[i]
                if (n <= 0) return i - 10000
            }

            return 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}