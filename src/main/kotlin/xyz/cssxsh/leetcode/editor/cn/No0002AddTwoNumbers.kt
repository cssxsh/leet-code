package xyz.cssxsh.leetcode.editor.cn

class No0002AddTwoNumbers {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }



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
        fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
            val r = ListNode(0)
            var a: ListNode? = l1
            var b: ListNode? = l2
            var c: ListNode = r
            while (true) {
                val s = (a?.`val` ?: 0) + (b?.`val` ?: 0) + c.`val`
                c.`val` = s % 10
                val n = ListNode(s / 10)
                c.next = n

                a = a?.next
                b = b?.next

                if (a == null && b == null) {
                    if (n.`val` == 0) {
                        c.next = null
                    }
                    break
                }
                c = n
            }
            return r
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}