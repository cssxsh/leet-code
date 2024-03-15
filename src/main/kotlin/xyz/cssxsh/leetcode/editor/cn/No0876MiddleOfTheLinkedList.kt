package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0876MiddleOfTheLinkedList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun middleNode(head: ListNode): ListNode {
            var p = head
            var q = head

            while (true) {
                q = q.next ?: break
                p = p.next ?: break
                q = q.next ?: break
            }
            return p
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}