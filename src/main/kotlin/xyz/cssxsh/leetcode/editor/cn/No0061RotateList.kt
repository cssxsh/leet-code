package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0061RotateList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun rotateRight(head: ListNode?, k: Int): ListNode? {
            var i = 0
            var tail = head ?: return null
            while (true) {
                i++
                tail = tail.next ?: break
            }
            val n = i

            tail.next = head
            i = n - k % n
            while (i-- > 0) {
                tail = tail.next!!
            }

            val root = tail.next
            tail.next = null

            return root
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}