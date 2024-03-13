package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.ListNode

class No0876MiddleOfTheLinkedList {
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
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