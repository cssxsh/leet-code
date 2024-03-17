package xyz.cssxsh.leetcode.editor.cn.data

class TreeNode(var `val`: Int) : AbstractNode<Int?>() {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun iterator(): Iterator<Int?> = iterator {
        val queue = ArrayDeque<TreeNode>()
        queue.addLast(element = this@TreeNode)
        yield(value = `val`)
        var nulls = 0
        while (queue.isEmpty().not()) {
            val node = queue.removeFirst()
            val left = node.left
            if (left != null) {
                while (nulls-- > 0) yield(value = null)
                yield(value = left.`val`)
                queue.addLast(element = left)
            } else {
                nulls++
            }
            val right = node.right
            if (right != null) {
                while (nulls-- > 0) yield(value = null)
                yield(value = right.`val`)
                queue.addLast(element = right)
            } else {
                nulls++
            }
        }
    }
}