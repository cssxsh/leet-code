package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.ListNode

object No0021MergeTwoSortedLists {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            val root = ListNode(1)
            var p = root
            var p1 = list1
            var p2 = list2

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