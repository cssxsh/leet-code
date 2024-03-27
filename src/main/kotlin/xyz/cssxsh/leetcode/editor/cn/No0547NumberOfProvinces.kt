package xyz.cssxsh.leetcode.editor.cn

object No0547NumberOfProvinces {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findCircleNum(isConnected: Array<IntArray>): Int {
            val n = isConnected.size
            val colors = IntArray(size = n)
            var count = 0

            fun dfs(index: Int, color: Int) {
                if (colors[index] == color) return
                colors[index] = color

                val connected = isConnected[index]
                for (i in 0 until n) {
                    if (connected[i] == 0) continue
                    dfs(index = i, color = color)
                }
            }

            for (i in 0 until n) {
                if (colors[i] != 0) continue
                dfs(index = i, color = ++count)
            }

            return count
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}