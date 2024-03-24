package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0019RemoveNthNodeFromEndOfList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
            val root = ListNode(0).apply { next = head }

            var fast = root
            var slow = root

            var i = n
            while (i > 0) {
                fast = fast.next ?: break
                i--
            }
            while (true) {
                fast = fast.next ?: break
                slow = slow.next ?: break
            }

            slow.next = slow.next?.next

            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}