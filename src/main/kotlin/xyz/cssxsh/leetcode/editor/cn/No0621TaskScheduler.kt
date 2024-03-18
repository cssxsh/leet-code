package xyz.cssxsh.leetcode.editor.cn

object No0621TaskScheduler {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun leastInterval(tasks: CharArray, n: Int): Int {
            if (n == 0) return tasks.size

            val counts = IntArray(size = 'Z' - 'A' + 1)
            for (task in tasks) counts[task - 'A']++

            val parts = counts.max()
            val max = (parts - 1) * (n + 1) + counts.count { it == parts }

            return maxOf(tasks.size, max)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}