package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0148SortList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun sortList(head: ListNode?): ListNode? {
            return sort(head = head, tail = null)
        }

        private fun sort(head: ListNode?, tail: ListNode?): ListNode? {
            if (head == null) return null
            if (head.next == tail) {
                head.next = null
                return head
            }

            var fast = head
            var slow = head
            while (fast != tail) {
                slow = slow?.next
                fast = fast?.next
                if (fast != tail) fast = fast?.next
            }
            val mid = slow
            val list1 = sort(head = head, tail = mid)
            val list2 = sort(head = mid, tail = tail)

            return merge(a = list1, b = list2)
        }

        private fun merge(a: ListNode?, b: ListNode?): ListNode? {
            val root = ListNode(0)
            var p = root
            var p1 = a
            var p2 = b

            while (p1 != null && p2 != null) {
                if (p1.`val` <= p2.`val`) {
                    p.next = p1
                    p1 = p1.next
                } else {
                    p.next = p2
                    p2 = p2.next
                }
                p = p.next!!
            }

            p.next = p1 ?: p2

            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}