package xyz.cssxsh.leetcode.editor.cn.data

class GraphNode(override val `val`: Int) : AbstractNode<Int, GraphNode>() {
    val neighbors: MutableList<GraphNode?> = ArrayList()

    override fun children(): Sequence<GraphNode> = neighbors.asSequence().filterIsInstance<GraphNode>()

    private fun nodes(): Map<Int, GraphNode> {
        val result = java.util.TreeMap<Int, GraphNode>()
        val queue = ArrayDeque<GraphNode>()
        result[`val`] = this@GraphNode
        queue.addLast(element = this@GraphNode)
        while (queue.isEmpty().not()) {
            val node = queue.removeFirst()
            for (neighbor in node.children()) {
                if (result.containsKey(key = neighbor.`val`)) continue
                result[neighbor.`val`] = neighbor
                queue.addLast(element = neighbor)
            }
        }

        return result
    }

    override fun iterator(): Iterator<Int> = nodes().keys.iterator()

    override fun equals(other: Any?): Boolean {
        if (other !is GraphNode) return false
        return toString() == other.toString()
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }

    override fun toString(): String {
        val nodes = nodes()
        return buildString {
            append('[')
            var i = 1
            for ((key, node) in nodes) {
                while (i < key) {
                    append('[')
                    append(']')
                    append(',')
                    i++
                }
                append('[')
                for (neighbor in node.children()) {
                    append(neighbor.`val`)
                    append(',')
                }
                if (get(length - 1) == ',') deleteCharAt(length - 1)
                append(']')
                append(',')
                i++
            }
            deleteCharAt(length - 1)
            append(']')
        }
    }
}