package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No2617MinimumNumberOfVisitedCellsInAGrid {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minimumVisitedCells(grid: Array<IntArray>): Int {
            val m = grid.size
            val n = grid[0].size
            val dist = Array(size = m) { IntArray(size = n) { Int.MAX_VALUE } }

            dist[0][0] = 1
            val comparator = { a: IntArray, b: IntArray -> a[0] - b[0] }
            val row = Array(size = m) { PriorityQueue(comparator) }
            val col = Array(size = n) { PriorityQueue(comparator) }

            for (j in 0 until m) {
                for (i in 0 until n) {
                    val r = row[j]
                    while (r.isEmpty().not()) {
                        val (_, x) = r.peek()
                        if (x + grid[j][x] >= i) {
                            dist[j][i] = minOf(dist[j][i], dist[j][x] + 1)
                            break
                        }
                        r.poll()
                    }

                    val c = col[i]
                    while (c.isEmpty().not()) {
                        val (_, y) = c.peek()
                        if (y + grid[y][i] >= j) {
                            dist[j][i] = minOf(dist[j][i], dist[y][i] + 1)
                            break
                        }
                        c.poll()
                    }

                    if (dist[j][i] != Int.MAX_VALUE) {
                        r.offer(intArrayOf(dist[j][i], i))
                        c.offer(intArrayOf(dist[j][i], j))
                    }
                }
            }

            val result = dist[m - 1][n - 1]
            return if (result == Int.MAX_VALUE) -1 else result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}