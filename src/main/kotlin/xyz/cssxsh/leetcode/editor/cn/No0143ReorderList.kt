package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0143ReorderList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reorderList(head: ListNode?) {
            val mid = run middle@{
                var fast = head ?: return
                var slow = fast
                while (true) {
                    fast = fast.next ?: break
                    slow = slow.next ?: break
                    fast = fast.next ?: break
                }
                return@middle slow
            }
            val reverse = run reverse@{
                var prev = null as ListNode?
                var node = mid.next
                mid.next = null
                while (node != null) {
                    val temp = node.next
                    node.next = prev
                    prev = node
                    node = temp
                }
                return@reverse prev
            }
            run merge@{
                var a = head
                var b = reverse
                var c = null as ListNode?
                while (a != null && b != null) {
                    c = a.next
                    a.next = b
                    a = c
                    c = b.next
                    b.next = a
                    b = c
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}