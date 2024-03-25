package xyz.cssxsh.leetcode.editor.cn

object No0289GameOfLife {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun gameOfLife(board: Array<IntArray>) {
            val m = board.size
            val n = board[0].size

            fun around(x: Int, y: Int): Int {
                var count = 0
                if (x - 0 > 0) count += board[y][x - 1] and 0x01
                if (y - 0 > 0) count += board[y - 1][x] and 0x01
                if (x + 1 < n) count += board[y][x + 1] and 0x01
                if (y + 1 < m) count += board[y + 1][x] and 0x01
                if (x - 0 > 0 && y - 0 > 0) count += board[y - 1][x - 1] and 0x01
                if (x + 1 < n && y - 0 > 0) count += board[y - 1][x + 1] and 0x01
                if (x + 1 < n && y + 1 < m) count += board[y + 1][x + 1] and 0x01
                if (x - 0 > 0 && y + 1 < m) count += board[y + 1][x - 1] and 0x01
                return count
            }

            for (j in 0 until m) {
                for (i in 0 until n) {
                    val around = around(x = i, y = j)
                    board[j][i] = when (board[j][i]) {
                        0x00 -> if (around == 3) 0x02 else 0x00
                        0x01 -> if (around == 2 || around == 3) 0x03 else 0x01
                        else -> throw IllegalStateException("(${i}, ${j}) -> ${board[j][i]}")
                    }
                }
            }

            for (j in 0 until m) {
                for (i in 0 until n) {
                    board[j][i] = board[j][i] shr 1
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}