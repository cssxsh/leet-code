package xyz.cssxsh.leetcode.editor.cn

object No0785IsGraphBipartite {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isBipartite(graph: Array<IntArray>): Boolean {
            val n = graph.size
            val colors = IntArray(size = n)

            fun dfs(node: Int, color: Int): Boolean {
                colors[node] = color
                for (neighbor in graph[node]) {
                    if (colors[neighbor] == color) return false
                    if (colors[neighbor] == -color) continue
                    if (dfs(node = neighbor, color = -color).not()) return false
                }

                return true
            }

            for (i in 0 until n) {
                if (colors[i] != 0) continue
                if (dfs(node = i, color = 1).not()) return false
            }

            return true
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}