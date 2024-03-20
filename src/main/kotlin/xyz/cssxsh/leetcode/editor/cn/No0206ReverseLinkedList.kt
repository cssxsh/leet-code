package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0206ReverseLinkedList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
            var node = head
            val root = ListNode(0)
            while (true) {
                val tmp = node ?: break
                node = node.next
                tmp.next = root.next
                root.next = tmp

            }
            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}