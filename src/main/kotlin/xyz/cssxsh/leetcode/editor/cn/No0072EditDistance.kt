package xyz.cssxsh.leetcode.editor.cn

object No0072EditDistance {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minDistance(word1: String, word2: String): Int {
            val n = word1.length
            val m = word2.length
            var min = Int.MAX_VALUE

            val dp = Array(size = m) { IntArray(size = n) { Int.MAX_VALUE } }

            fun dfs(i: Int, j: Int, op: Int) {
                if (op >= min) return
                if (j == m) {
                    min = minOf(op + n - i, min)
                    return
                }
                if (i == n) {
                    min = minOf(op + m - j, min)
                    return
                }
                if (dp[j][i] > op) dp[j][i] = op else return

                if (word1[i] == word2[j]) {
                    // offset
                    dfs(i = i + 1, j = j + 1, op = op)
                } else {
                    // replace
                    dfs(i = i + 1, j = j + 1, op = op + 1)
                    // delete
                    dfs(i = i + 1, j = j, op = op + 1)
                    // insert
                    dfs(i = i, j = j + 1, op = op + 1)
                }
            }

            dfs(i = 0, j = 0, op = 0)

            return min
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}