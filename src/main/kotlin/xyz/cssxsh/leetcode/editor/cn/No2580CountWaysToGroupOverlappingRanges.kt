package xyz.cssxsh.leetcode.editor.cn

object No2580CountWaysToGroupOverlappingRanges {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun countWays(ranges: Array<IntArray>): Int {
            ranges.sortWith { a, b -> a[0] - b[0] }

            var count = 1
            var prev = -1
            for ((start, end) in ranges) {
                if (prev < start) {
                    count = count * 2 % 10_0000_0007
                }
                prev = maxOf(end, prev)
            }

            return count
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}