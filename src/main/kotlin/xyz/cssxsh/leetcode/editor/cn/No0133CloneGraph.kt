package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.GraphNode as Node

object No0133CloneGraph {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun cloneGraph(node: Node?): Node? {
            if (node == null) return null
            val result = HashMap<Int, Node>()
            val queue = ArrayDeque<Node>()
            queue.addLast(element = node)

            while (queue.isEmpty().not()) {
                val current = queue.removeFirst()
                val clone = result.getOrPut(key = current.`val`) { Node(current.`val`) }
                if (current.neighbors.size == clone.neighbors.size) continue
                for (neighbor in current.neighbors) {
                    if (neighbor == null) continue
                    clone.neighbors.add(element = result.getOrPut(key = neighbor.`val`) { Node(neighbor.`val`) })
                    queue.add(element = neighbor)
                }
            }

            return result[1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}