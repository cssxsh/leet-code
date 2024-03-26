package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0100SameTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            val queue = ArrayDeque<Pair<TreeNode?, TreeNode?>>()
            queue.addLast(element = p to q)

            while (queue.isEmpty().not()) {
                val (a, b) = queue.removeFirst()
                if (a == null && b == null) continue
                if (a?.`val` != b?.`val`) return false

                queue.addLast(element = a?.left to b?.left)
                queue.addLast(element = a?.right to b?.right)
            }

            return true
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}