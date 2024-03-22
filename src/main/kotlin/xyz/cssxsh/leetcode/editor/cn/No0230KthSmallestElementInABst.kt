package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0230KthSmallestElementInABst {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun kthSmallest(root: TreeNode?, k: Int): Int {
            if (root == null) return Int.MIN_VALUE
            val stack = ArrayDeque<TreeNode>()
            var prev = root
            var i = 0
            while (true) {
                if (prev == null) {
                    if (stack.isEmpty()) break
                    val node = stack.removeLast()
                    i++
                    if (k == i) return node.`val`
                    prev = node.right
                    continue
                }
                stack.addLast(element = prev)
                prev = prev.left
            }

            return Int.MAX_VALUE
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}