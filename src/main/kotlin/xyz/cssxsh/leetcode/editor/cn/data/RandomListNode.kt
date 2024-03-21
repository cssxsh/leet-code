package xyz.cssxsh.leetcode.editor.cn.data

class RandomListNode(override var `val`: Int) : AbstractNode<Int, RandomListNode>() {
    var next: RandomListNode? = null
    var random: RandomListNode? = null

    override fun children(): Sequence<RandomListNode?> = sequenceOf(next, random)

    private fun sequence(): Sequence<RandomListNode> = sequence {
        var slow = this@RandomListNode
        var fast = this@RandomListNode
        var flag = this@RandomListNode

        while (true) {
            yield(value = slow)
            slow = slow.next ?: break
            fast = fast.next ?: continue
            fast = fast.next ?: continue

            if (slow === fast) {
                while (slow !== flag) {
                    yield(value = slow)
                    slow = slow.next!!
                    flag = flag.next!!
                }
                break
            }
        }
    }

    override fun iterator(): Iterator<Int> = sequence().map { it.`val` }.iterator()

    override fun equals(other: Any?): Boolean {
        if (other !is RandomListNode) return false
        return toString() == other.toString()
    }

    override fun hashCode(): Int {
        return sequence().fold(initial = 0) { acc, node ->
            var hash = acc.hashCode()
            hash = hash * 31 + node.`val`.hashCode()
            hash = hash * 31 + (node.next?.`val`?.hashCode() ?: 0)
            hash = hash * 31 + (node.random?.`val`?.hashCode() ?: 0)
            hash
        }
    }

    override fun toString(): String {
        val nodes = sequence().toList()
        return buildString {
            append('[')
            for (node in nodes) {
                append('(')
                append(node.`val`)
                append(',')
                append(nodes.indices.find { nodes[it] === node.random })
                append(')')
                append(',')
            }
            deleteCharAt(length - 1)
            append(']')
        }
    }
}