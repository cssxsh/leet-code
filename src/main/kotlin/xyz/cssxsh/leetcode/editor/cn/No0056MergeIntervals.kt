package xyz.cssxsh.leetcode.editor.cn

object No0056MergeIntervals {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun merge(intervals: Array<IntArray>): Array<out IntArray> {
            val sorted = intervals
                .sortedArrayWith { (ai, _), (bi, _) -> ai.compareTo(bi) }

            val list = buildList {
                var (a, b) = sorted[0]
                for ((c, d) in sorted) {
                    if (c <= b) {
                        b = maxOf(b, d)
                    } else {
                        add(element = intArrayOf(a, b))
                        a = c
                        b = d
                    }
                }
                add(element = intArrayOf(a, b))
            }
            return list.toTypedArray()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}