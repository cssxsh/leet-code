package xyz.cssxsh.leetcode.editor.cn

object No0529Minesweeper {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun updateBoard(board: Array<CharArray>, click: IntArray): Array<CharArray> {
            val m = board.size
            val n = board[0].size

            fun dfs(r: Int, c: Int) {
                if (board[r][c] != 'E') return

                var count = 0
                if (c - 0 > 0 && board[r][c - 1] == 'M') count++
                if (r - 0 > 0 && board[r - 1][c] == 'M') count++
                if (c + 1 < n && board[r][c + 1] == 'M') count++
                if (r + 1 < m && board[r + 1][c] == 'M') count++
                if (c - 0 > 0 && r - 0 > 0 && board[r - 1][c - 1] == 'M') count++
                if (c + 1 < n && r - 0 > 0 && board[r - 1][c + 1] == 'M') count++
                if (c + 1 < n && r + 1 < m && board[r + 1][c + 1] == 'M') count++
                if (c - 0 > 0 && r + 1 < m && board[r + 1][c - 1] == 'M') count++

                if (count != 0) {
                    board[r][c] = '0' + count
                    return
                }
                board[r][c] = 'B'

                if (c - 0 > 0) dfs(r = r, c = c - 1)
                if (r - 0 > 0) dfs(r = r - 1, c = c)
                if (c + 1 < n) dfs(r = r, c = c + 1)
                if (r + 1 < m) dfs(r = r + 1, c = c)
                if (c - 0 > 0 && r - 0 > 0) dfs(r = r - 1, c = c - 1)
                if (c + 1 < n && r - 0 > 0) dfs(r = r - 1, c = c + 1)
                if (c + 1 < n && r + 1 < m) dfs(r = r + 1, c = c + 1)
                if (c - 0 > 0 && r + 1 < m) dfs(r = r + 1, c = c - 1)
            }

            val (r, c) = click
            when (board[r][c]) {
                'M' -> {
                    board[r][c] = 'X'
                }
                'E' -> {
                    dfs(r = r, c = c)
                }
                else -> {
                    throw IllegalStateException("(${r},${c}) -> ${board[r][c]}")
                }
            }

            return board
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}