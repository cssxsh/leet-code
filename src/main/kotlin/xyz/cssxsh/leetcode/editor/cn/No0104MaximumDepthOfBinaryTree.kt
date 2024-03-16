package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0104MaximumDepthOfBinaryTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxDepth(root: TreeNode?): Int {
            val node = root ?: return 0
            val max = maxOf(maxDepth(root = node.left), maxDepth(root = node.right))
            return max + 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}