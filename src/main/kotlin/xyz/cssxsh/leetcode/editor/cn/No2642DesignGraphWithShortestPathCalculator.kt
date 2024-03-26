package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No2642DesignGraphWithShortestPathCalculator {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<Graph>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Graph(n: Int, edges: Array<IntArray>) {

        private val costs = Array(size = n) { IntArray(size = n) }

        init {
            for ((from, to, cost) in edges) costs[from][to] = cost
        }

        fun addEdge(edge: IntArray) {
            val (from, to, cost) = edge
            costs[from][to] = cost
        }

        /**
         * [最短路](https://oi-wiki.org/graph/shortest-path/)
         */
        fun shortestPath(node1: Int, node2: Int): Int {
            val n = costs.size
            val queue = PriorityQueue<Pair<Int, Int>> { (a), (b) -> a - b }
            val dist = IntArray(size = n) { Int.MAX_VALUE }
            dist[node1] = 0
            queue.offer(0 to node1)

            while (queue.isEmpty().not()) {
                val (short, current) = queue.poll()
                if (current == node2) return short

                for (next in 0 until n) {
                    val cost = costs[current][next]
                    if (cost == 0) continue
                    if (dist[next] > short + cost) {
                        dist[next] = short + cost
                        queue.offer(short + cost to next)
                    }
                }
            }

            return -1
        }

        override fun toString(): String {
            return buildString {
                append("Graph(")
                append("edges=")
                append(costs.sumOf { edges -> edges.count { it != 0 } })
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}