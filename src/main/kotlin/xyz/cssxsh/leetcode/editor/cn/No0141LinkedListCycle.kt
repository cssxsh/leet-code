package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0141LinkedListCycle {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        @PublishedApi
        internal fun test(head: ListNode?, pos: Int): Boolean {
            head?.also { instance ->
                val member = ListNode::class.members
                    .find { it.name == "cycle" } ?: return@also
                member.call(instance, pos)
            }
            return hasCycle(head = head)
        }

        fun hasCycle(head: ListNode?): Boolean {
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