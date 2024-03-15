package xyz.cssxsh.leetcode.editor.cn

object No2684MaximumNumberOfMovesInAGrid {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxMoves(grid: Array<IntArray>): Int {

            val n = grid.size
            val m = grid[0].size
            val counts = IntArray(size = n) { 0 }
            val now = IntArray(size = n)

            fun value(y: Int, x: Int): Int {
                if (x !in 0 until m) return 0
                if (y !in 0 until n) return 0
                return grid[y][x]
            }

            fun move(value: Int, y: Int, x: Int): Int {
                return if (value < value(y = y, x = x)) counts[y] + 1 else 0
            }

            for (col in m - 2 downTo 0) {
                for (row in 0 until n) {
                    val o = value(y = row, x = col)

                    val a = move(value = o, y = row - 1, x = col + 1)
                    val b = move(value = o, y = row, x = col + 1)
                    val c = move(value = o, y = row + 1, x = col + 1)

                    now[row] = maxOf(a, b, c)
                }
                now.copyInto(counts)
            }

            return counts.max()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
