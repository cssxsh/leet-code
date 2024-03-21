package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0160IntersectionOfTwoLinkedLists {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun getIntersectionNode(
            intersectVal: Int,
            listA: ListNode,
            listB: ListNode,
            skipA: Int,
            skipB: Int
        ): ListNode? {
            val a = ListNode(0).apply { next = listA }
            val b = ListNode(0).apply { next = listB }

            if (intersectVal != 0) {
                var i = 0
                var pa = a
                while (i++ < skipA) pa = pa.next ?: break
                i = 0
                var pb = b
                while (i++ < skipB) pb = pb.next ?: break

                pb.next = pa.next
            }

            return getIntersectionNode(headA = a.next!!, headB = b.next!!)
        }

        @PublishedApi
        internal fun getIntersectionNode(headA: ListNode, headB: ListNode): ListNode? {
            if (headA === headB) return headA
            val a = ListNode(0).apply { next = headA }
            val b = ListNode(0).apply { next = headB }

            var i = 0
            var pa = a
            while (true) {
                pa = pa.next ?: break
                i++
            }
            val m = i

            i = 0
            var pb = b
            while (true) {
                pb = pb.next ?: break
                i++
            }
            val n = i

            pa = a
            i = m
            while (i > n) {
                pa = pa.next ?: break
                i--
            }

            pb = b
            i = n
            while (i > m) {
                pb = pb.next ?: break
                i--
            }

            while (true) {
                if (pa === pb) return pa
                pa = pa.next ?: break
                pb = pb.next ?: break
            }

            return null
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}