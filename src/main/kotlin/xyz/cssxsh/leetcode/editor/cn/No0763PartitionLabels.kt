package xyz.cssxsh.leetcode.editor.cn

object No0763PartitionLabels {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun partitionLabels(s: String): List<Int> {
            val n = s.length
            val last = IntArray(size = 'z' - 'a' + 1)
            for (i in 0 until n) last[s[i] - 'a'] = i

            val parts = ArrayList<Int>()
            var start = 0
            var end = 0
            for (i in 0 until n) {
                end = maxOf(last[s[i] - 'a'], end)
                if (i == end) {
                    parts.add(element = end - start + 1)
                    start = end + 1
                }
            }

            return parts
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}