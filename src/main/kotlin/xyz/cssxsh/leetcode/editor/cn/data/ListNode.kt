package xyz.cssxsh.leetcode.editor.cn.data

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return buildString {
            var node = this@ListNode as ListNode?
            append('[')
            append(node!!.`val`)
            node = node.next
            while (node != null) {
                append(',')
                append(node.`val`)
                node = node.next
            }
            append(']')
        }
    }

    override fun equals(other: Any?): Boolean {
        var p = this
        var q = other as? ListNode ?: return false
        while (true) {
            if (p.`val` != q.`val`) return false
            if (p.next == null || q.next == null) return true

            p = p.next ?: break
            q = q.next ?: break
        }
        return false
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }
}