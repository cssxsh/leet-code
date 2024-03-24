package xyz.cssxsh.leetcode.editor.cn

object No0200NumberOfIslands {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun numIslands(grid: Array<CharArray>): Int {
            val m = grid.size
            val n = grid[0].size

            var result = 0

            fun link(x: Int, y: Int) {
                grid[y][x] = 'a' + result
                if (x + 1 < n && grid[y][x + 1] == '1') link(x = x + 1, y = y)
                if (y + 1 < m && grid[y + 1][x] == '1') link(x = x, y = y + 1)
                if (x - 0 > 0 && grid[y][x - 1] == '1') link(x = x - 1, y = y)
                if (y - 0 > 0 && grid[y - 1][x] == '1') link(x = x, y = y - 1)
            }

            for (j in 0 until m) {
                for (i in 0 until n) {
                    if (grid[j][i] == '1') {
                        link(x = i, y = j)
                        result++
                    }
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}