package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0141LinkedListCycle {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun hasCycle(head: ListNode?, pos: Int): Boolean {
            run cycle@{
                var p = head ?: return@cycle
                var q = p
                var i = 0
                while (i != pos) {
                    p = p.next ?: break
                    i++
                    q = p
                }
                p.next = if (i == pos) q else null
            }
            return hasCycle(head = head)
        }

        @PublishedApi
        internal fun hasCycle(head: ListNode?): Boolean {
            var p = head ?: return false
            var q = p

            do {
                p = p.next ?: return false
                q = q.next?.next ?: return false
            } while (p !== q)

            return true
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}