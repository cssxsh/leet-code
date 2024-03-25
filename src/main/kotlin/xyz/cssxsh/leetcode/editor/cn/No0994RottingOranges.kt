package xyz.cssxsh.leetcode.editor.cn

object No0994RottingOranges {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun orangesRotting(grid: Array<IntArray>): Int {
            val m = grid.size
            val n = grid[0].size

            fun rotting(x: Int, y: Int): Boolean {
                return (x - 0 > 0 && grid[y][x - 1] == 0x2) ||
                    (x + 1 < n && grid[y][x + 1] == 0x2) ||
                    (y - 0 > 0 && grid[y - 1][x] == 0x2) ||
                    (y + 1 < m && grid[y + 1][x] == 0x2)
            }

            var time = 0
            while (true) {
                var oranges = 0
                var rotting = 0
                for (j in 0 until m) {
                    for (i in 0 until n) {
                        if (grid[j][i] == 0x1) {
                            oranges++
                            if (rotting(x = i, y = j)) {
                                grid[j][i] = 0x03
                                rotting++
                            }
                        }
                    }
                }
                if (oranges == 0) break
                if (rotting == 0) return -1

                for (j in 0 until m) {
                    for (i in 0 until n) {
                        if (grid[j][i] == 0x03) {
                            grid[j][i] = 0x02
                        }
                    }
                }
                time++
            }

            return time
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}