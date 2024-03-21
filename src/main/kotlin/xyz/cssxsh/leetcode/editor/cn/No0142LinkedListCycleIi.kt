package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0142LinkedListCycleIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun detectCycle(head: ListNode?, pos: Int): ListNode? {
            head?.also { instance ->
                val member = ListNode::class.members
                    .find { it.name == "cycle" } ?: return@also
                member.call(instance, pos)
            }
            return detectCycle(head = head)
        }

        @PublishedApi
        internal fun detectCycle(head: ListNode?): ListNode? {
            var flag = head ?: return null
            var slow = flag
            var fast = flag

            do {
                slow = slow.next ?: return null
                fast = fast.next?.next ?: return null
            } while (slow !== fast)

            while (slow !== flag) {
                slow = slow.next!!
                flag = flag.next!!
            }

            return flag
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}