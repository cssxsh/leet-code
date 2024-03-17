package xyz.cssxsh.leetcode.editor.cn

object No0310MinimumHeightTrees {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
            val degrees = IntArray(size = n)
            for ((a, b) in edges) {
                degrees[a]++
                degrees[b]++
            }

            var count = n
            while (count > 2) {
                val leaves = (0 until n).filter { degrees[it] == 1 }
                for (leaf in leaves) {
                    for ((a, b) in edges) {
                        when (leaf) {
                            a -> if (degrees[b] > 0) degrees[b]-- else continue
                            b -> if (degrees[a] > 0) degrees[a]-- else continue
                            else -> continue
                        }
                        break
                    }

                    degrees[leaf] = -1
                    count--
                }
            }
            println(degrees.contentToString())

            return (0 until n).filter { degrees[it] >= 0 }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}