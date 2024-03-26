package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0082RemoveDuplicatesFromSortedListIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun deleteDuplicates(head: ListNode?): ListNode? {
            val root = ListNode(0).apply { next = head }

            var prev = root
            while (true) {
                var node = prev.next ?: break
                if (node.`val` == node.next?.`val`) {
                    val target = node.`val`
                    while (node.`val` == target) {
                        prev.next = node.next
                        node = prev.next ?: break
                    }
                } else {
                    prev = node
                }
            }

            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}