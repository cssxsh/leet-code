package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0023MergeKSortedLists {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun mergeKLists(lists: Array<ListNode?>): ListNode? {
            val k = lists.size
            if (k == 0) return null
            if (k == 1) return lists[0]

            val root = ListNode(1)
            var p = root

            while (true) {
                var j = k
                var min = ListNode(Int.MAX_VALUE)
                for (i in 0 until k) {
                    val node = lists[i] ?: continue
                    if (min.`val` > node.`val`) {
                        min = node
                        j = i
                    }
                }
                if (j == k) break
                p.next = min
                lists[j] = min.next

                p = p.next ?: break
            }

            return root.next
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}