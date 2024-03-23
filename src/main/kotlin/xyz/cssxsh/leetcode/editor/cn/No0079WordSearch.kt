package xyz.cssxsh.leetcode.editor.cn

object No0079WordSearch {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun exist(board: Array<CharArray>, word: String): Boolean {
            val m = board.size
            val n = board[0].size
            val k = word.length

            fun dfs(i: Int, j: Int, offset: Int): Boolean {
                if (i !in 0 until n) return false
                if (j !in 0 until m) return false
                if (board[j][i] != word[offset]) return false
                if (offset == k - 1) return true

                board[j][i] = '?'
                val result = dfs(i = i + 1, j = j, offset = offset + 1) ||
                    dfs(i = i - 1, j = j, offset = offset + 1) ||
                    dfs(i = i, j = j + 1, offset = offset + 1) ||
                    dfs(i = i, j = j - 1, offset = offset + 1)
                board[j][i] = word[offset]

                return result
            }

            for (j in 0 until m) {
                for (i in 0 until n) {
                    if (dfs(i = i, j = j, offset = 0)) return true
                }
            }

            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}