package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*
import xyz.cssxsh.leetcode.editor.cn.data.RandomListNode as Node

object No0138CopyListWithRandomPointer {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun copyRandomList(node: Node?): Node? {
            val head = Node(0)

            var prev = node ?: return null
            while (true) {
                val new = Node(prev.`val`)
                new.next = prev.next
                prev.next = new

                prev = new.next ?: break
            }
            prev = node
            while (true) {
                val new = prev.next!!
                new.random = prev.random?.next

                prev = new.next ?: break
            }
            prev = node
            var clone = head
            while (true) {
                val new = prev.next!!
                clone.next = new
                clone = new
                prev.next = new.next

                prev = prev.next ?: break
            }

            return head.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}