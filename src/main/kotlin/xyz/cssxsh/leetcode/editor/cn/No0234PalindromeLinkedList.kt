package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0234PalindromeLinkedList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isPalindrome(head: ListNode): Boolean {
            if (head.next == null) return true

            var fast = head
            var slow = head
            var i = 0
            while (true) {
                fast = fast.next ?: break
                slow = slow.next ?: break
                i++
                fast = fast.next ?: break
                i--
            }
            val mid = slow

            val root = ListNode(0)
            var p = head as? ListNode?
            while (p != null) {
                val t = p
                if (t === mid) break

                p = p.next
                t.next = root.next
                root.next = t
            }

            var a = root.next
            var b = if (i == 0) mid.next else mid
            while (a != null && b != null) {
                if (a.`val` != b.`val`) break
                a = a.next
                b = b.next
            }

            return b == null
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}