package xyz.cssxsh.leetcode.editor.cn.data

class TreeNode(var `val`: Int) : AbstractNode<Int?>() {
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun iterator(): Iterator<Int?> = iterator {
        val stack = ArrayDeque<TreeNode>()
        stack.addLast(element = this@TreeNode)
        yield(value = `val`)
        while (stack.isEmpty().not()) {
            val node = stack.removeLast()
            val left = node.left
            if (left != null) {
                yield(value = left.`val`)
                stack.addLast(element = left)
            }
            val right = node.right
            if (right != null) {
                if (left == null) yield(value = null)
                yield(value = right.`val`)
                stack.addLast(element = right)
            }
        }
    }
}