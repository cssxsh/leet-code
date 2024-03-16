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

    fun cycle(pos: Int) {
        var p = this
        var q = p
        var i = 0
        while (i != pos) {
            p = p.next ?: break
            i++
            q = p
        }
        p.next = if (i == pos) q else null
    }
}