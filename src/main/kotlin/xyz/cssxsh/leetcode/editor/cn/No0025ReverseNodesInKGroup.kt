package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0025ReverseNodesInKGroup {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverseKGroup(head: ListNode, k: Int): ListNode {
            if (k == 1) return head
            val root = ListNode(0).apply { next = head }

            var p = root
            val q = ListNode(0)
            while (true) {
                var i = k
                var t = p
                while (i > 0) {
                    val out = p.next ?: break
                    p.next = out.next

                    if (i == k) t = out
                    out.next = q.next
                    q.next = out

                    i--
                }
                if (i == 0) {
                    t.next = p.next
                    p.next = q.next
                    p = t
                    q.next = null
                } else {
                    while (true) {
                        val out = q.next ?: break
                        q.next = out.next

                        out.next = p.next
                        p.next = out
                    }

                    break
                }
            }

            return root.next!!
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}