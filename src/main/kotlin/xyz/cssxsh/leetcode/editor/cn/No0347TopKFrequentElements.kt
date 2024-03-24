package xyz.cssxsh.leetcode.editor.cn

object No0347TopKFrequentElements {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun topKFrequent(nums: IntArray, k: Int): IntArray {
            val top = IntArray(size = k)
            val counts = hashMapOf<Int, Int>()
            for (num in nums) {
                counts[num] = (counts[num] ?: 0) + 1
            }

            var i = 0
            for ((num, _) in counts.entries.sortedByDescending { it.value }) {
                if (i >= k) break
                top[i++] = num
            }

            return top
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}