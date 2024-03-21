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

    val queue = ArrayDeque<TreeNode>()
    queue.addLast(element = root)

    while (queue.isEmpty().not()) {
        val node = queue.removeFirst()
        if (iterator.hasNext().not()) break
        val l = iterator.next()
        if (l != null) {
            val left = TreeNode(l)
            node.left = left
            queue.addLast(element = left)
        }
        if (iterator.hasNext().not()) break
        val r = iterator.next()
        if (r != null) {
            val right = TreeNode(r)
            node.right = right
            queue.addLast(element = right)
        }
    }

    return root
}

@PublishedApi
internal fun randomListNodeOf(vararg pairs: Pair<Int, Int?>): RandomListNode {
    return pairs.asSequence().toRandomListNode() ?: throw IllegalArgumentException("empty")
}

@PublishedApi
internal fun Sequence<Pair<Int, Int?>>.toRandomListNode(): RandomListNode? {
    val root = RandomListNode(0)
    val map = hashMapOf<Int, RandomListNode>()
    var prev = root
    var i = 0
    for ((value, random) in this) {
        val node = map.getOrPut(key = i) { RandomListNode(0) }
        node.`val` = value
        prev.next = node
        prev = node
        i++

        random ?: continue
        node.random = map.getOrPut(key = random) { RandomListNode(0) }
    }

    return root.next
}