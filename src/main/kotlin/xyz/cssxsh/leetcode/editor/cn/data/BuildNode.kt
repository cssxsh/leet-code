package xyz.cssxsh.leetcode.editor.cn.data

@PublishedApi
internal fun listNodeOf(vararg values: Int): ListNode {
    return values.asSequence().toListNode() ?: throw IllegalArgumentException("empty")
}

@PublishedApi
internal fun Sequence<Int>.toListNode(): ListNode? {
    val root = ListNode(0)
    fold(initial = root) { prev, v -> ListNode(v).also { prev.next = it } }
    return root.next
}

@PublishedApi
internal fun treeNodeOf(vararg values: Int?): TreeNode? {
    return values.asSequence().toTreeNode()
}

@PublishedApi
internal fun Sequence<Int?>.toTreeNode(): TreeNode? {
    val iterator = iterator()
    if (iterator.hasNext().not()) return null
    val root = TreeNode(iterator.next() ?: return null)

    val stack = ArrayDeque<TreeNode>()
    stack.addLast(element = root)

    while (stack.isEmpty().not()) {
        val node = stack.removeLast()
        if (iterator.hasNext().not()) break
        val l = iterator.next()
        if (l != null) {
            val left = TreeNode(l)
            node.left = left
            stack.addLast(element = left)
        }
        if (iterator.hasNext().not()) break
        val r = iterator.next()
        if (r != null) {
            val right = TreeNode(r)
            node.right = right
            stack.addLast(element = right)
        }
    }

    return root
}