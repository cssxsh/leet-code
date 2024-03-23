package xyz.cssxsh.leetcode.editor.cn.data

class TreeNode(override var `val`: Int) : AbstractNode<Int?, TreeNode>() {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun children(): Sequence<TreeNode?> = sequenceOf(left, right)

    override fun iterator(): Iterator<Int?> = iterator {
        val queue = ArrayDeque<TreeNode>()
        yield(value = `val`)
        queue.addLast(element = this@TreeNode)
        var nulls = 0
        while (queue.isEmpty().not()) {
            val node = queue.removeFirst()
            for (child in node.children()) {
                if (child != null) {
                    while (nulls > 0) {
                        yield(value = null)
                        nulls--
                    }
                    yield(value = child.`val`)
                    queue.addLast(element = child)
                } else {
                    nulls++
                }
            }
        }
    }

    fun find(value: Int): TreeNode? {
        val queue = ArrayDeque<TreeNode>()
        queue.addLast(element = this)
        while (queue.isEmpty().not()) {
            val node = queue.removeFirst()
            if (node.`val` == value) return node
            for (child in node.children()) {
                if (child == null) continue
                queue.addLast(element = child)
            }
        }

        return null
    }
}