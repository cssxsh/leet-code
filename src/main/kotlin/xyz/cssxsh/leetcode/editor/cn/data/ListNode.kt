package xyz.cssxsh.leetcode.editor.cn.data

class ListNode(override var `val`: Int) : AbstractNode<Int, ListNode>() {
    var next: ListNode? = null

    override fun children(): Sequence<ListNode?> = sequenceOf(next)

    override fun iterator(): Iterator<Int> = iterator {
        var slow = this@ListNode
        var fast = this@ListNode
        var flag = this@ListNode

        while (true) {
            yield(value = slow.`val`)
            slow = slow.next ?: break
            fast = fast.next ?: continue
            fast = fast.next ?: continue

            if (slow === fast) {
                while (slow !== flag) {
                    yield(value = slow.`val`)
                    slow = slow.next!!
                    flag = flag.next!!
                }
                break
            }
        }
    }

    fun cycle(pos: Int): ListNode {
        run check@{
            var fast = this@ListNode
            var slow = this@ListNode

            do {
                slow = slow.next ?: return@check
                fast = fast.next?.next ?: return@check
            } while (fast !== slow)

            throw IllegalStateException("cycle already exists")
        }

        var p = this
        var q = null as ListNode?
        var i = 0
        while (true) {
            if (i == pos) q = p
            p = p.next ?: break
            i++
        }

        p.next = q

        return this
    }
}