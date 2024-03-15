package xyz.cssxsh.leetcode.editor.cn.data

@PublishedApi
internal fun listNodeOf(vararg values: Int): ListNode {
    val root = ListNode(0)
    values.fold(initial = root) { prev, v -> ListNode(v).also { prev.next = it } }
    return root.next ?: throw IllegalArgumentException("empty")
}