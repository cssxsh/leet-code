package xyz.cssxsh.leetcode.editor.cn.data

class ListNode(var `val`: Int) : AbstractNode<Int>() {
    var next: ListNode? = null

    override fun iterator(): Iterator<Int> = iterator {
        var node = this@ListNode
        while (true) {
            yield(value = node.`val`)
            node = node.next ?: break
        }
    }
}