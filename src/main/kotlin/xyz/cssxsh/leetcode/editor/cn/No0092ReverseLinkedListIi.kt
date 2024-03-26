package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0092ReverseLinkedListIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverseBetween(head: ListNode, left: Int, right: Int): ListNode {
            if (left == right) return head
            val root = ListNode(0).apply { next = head }
            val temp = ListNode(0)

            var prev = root
            var i = 1
            while (i < left) {
                prev = prev.next ?: break
                i++
            }
            val tail = prev.next!!
            while (i <= right) {
                val node = prev.next ?: break
                prev.next = node.next
                node.next = temp.next
                temp.next = node
                i++
            }
            tail.next = prev.next
            prev.next = temp.next

            return root.next!!
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}