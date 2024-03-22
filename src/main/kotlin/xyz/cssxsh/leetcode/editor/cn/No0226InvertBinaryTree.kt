package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0226InvertBinaryTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun invertTree(root: TreeNode?): TreeNode? {
            if (root == null) return null

            val temp = root.left
            root.left = root.right
            root.right = temp

            invertTree(root = root.left)
            invertTree(root = root.right)

            return root
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}