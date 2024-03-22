package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0024SwapNodesInPairs {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun swapPairs(head: ListNode?): ListNode? {
            val root = ListNode(0).apply { next = head }

            var prev = root
            while (true) {
                val p = prev.next ?: break
                val q = p.next ?: break
                prev.next = q
                p.next = q.next
                q.next = p

                prev = p
            }

            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}