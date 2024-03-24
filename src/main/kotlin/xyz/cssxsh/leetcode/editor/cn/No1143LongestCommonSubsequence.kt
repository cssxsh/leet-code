package xyz.cssxsh.leetcode.editor.cn

object No1143LongestCommonSubsequence {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestCommonSubsequence(text1: String, text2: String): Int {
            val n = text1.length
            val m = text2.length

            val dp = Array(size = m) { IntArray(size = n) { Int.MAX_VALUE } }

            fun dfs(i: Int, j: Int): Int {
                if (j == m) return 0
                if (i == n) return 0

                if (dp[j][i] != Int.MAX_VALUE) return dp[j][i]

                val result = if (text1[i] == text2[j]) {
                    dfs(i = i + 1, j = j + 1) + 1
                } else {
                    maxOf(dfs(i = i + 1, j = j), dfs(i = i, j = j + 1))
                }

                dp[j][i] = result

                return result
            }

            return dfs(i = 0, j = 0)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}