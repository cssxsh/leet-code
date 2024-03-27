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
internal infix fun Pair<ListNode, ListNode>.intersection(skip: Pair<Int, Int>): Pair<ListNode, ListNode> {
    val a = ListNode(0).apply { next = first }
    val b = ListNode(0).apply { next = second }

    var i = 0
    var pa = a
    while (i++ < skip.first) pa = pa.next ?: throw IllegalArgumentException("$first too short")
    i = 0
    var pb = b
    while (i++ < skip.second) pb = pb.next ?: throw IllegalArgumentException("$second too short")

    pb.next = pa.next

    return a.next!! to b.next!!
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

@PublishedApi
internal fun graphNodeOf(vararg neighbors: List<Int>): GraphNode? {
    return neighbors.asSequence().toGraphNode()
}

@PublishedApi
internal fun Sequence<List<Int>>.toGraphNode(): GraphNode? {
    val map = hashMapOf<Int, GraphNode>()
    var i = 1
    for (neighbors in this) {
        val current = map.getOrPut(key = i) { GraphNode(i) }
        for (neighbor in neighbors) {
            val node = map.getOrPut(key = neighbor) { GraphNode(neighbor) }
            current.neighbors.add(element = node)
        }
        i++
    }

    return map[1]
}