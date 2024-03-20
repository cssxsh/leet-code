package xyz.cssxsh.leetcode.editor.cn

object No0797AllPathsFromSourceToTarget {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
            val n = graph.size

            val stack = ArrayDeque<List<Int>>()
            stack.addLast(element = listOf(0))

            val queue = ArrayDeque<List<Int>>()
            queue.addLast(element = emptyList())

            val result = mutableListOf<List<Int>>()

            while (stack.isEmpty().not()) {
                val record = stack.removeLast()
                val node = record.last()
                if (node == n - 1) {
                    result.add(0, record)
                    continue
                }

                for (next in graph[node]) {
                    stack.addLast(element = record + next)
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}