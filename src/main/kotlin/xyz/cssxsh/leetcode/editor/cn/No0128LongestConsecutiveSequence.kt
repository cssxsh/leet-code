package xyz.cssxsh.leetcode.editor.cn

object No0128LongestConsecutiveSequence {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestConsecutive(nums: IntArray): Int {
            val map = hashMapOf<Int, Int>()
            for (num in nums) {
                if (num in map) continue
                val l = map.getOrDefault(key = num - 1, defaultValue = 0)
                val r = map.getOrDefault(key = num + 1, defaultValue = 0)
                val sum = l + 1 + r
                map[num] = sum
                map[num - l] = sum
                map[num + r] = sum
            }
            return map.values.maxOrNull() ?: 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}