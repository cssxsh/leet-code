package xyz.cssxsh.leetcode.editor.cn

object No0560SubarraySumEqualsK {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun subarraySum(nums: IntArray, k: Int): Int {
            var cnt = 0
            var sum = 0
            val map = hashMapOf(0 to 1)
            for (num in nums) {
                sum += num
                cnt += map.getOrDefault(sum - k, 0)
                map.compute(sum) { _, v -> (v ?: 0) + 1 }
            }

            return cnt
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
