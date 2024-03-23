package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0543DiameterOfBinaryTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun diameterOfBinaryTree(root: TreeNode?): Int {
            if (root == null) return 0
            var diameter = 0

            // val diameter = depth(root.left) + depth(root.right) + 1

            fun depth(root: TreeNode?): Int {
                if (root == null) return 0
                val l = depth(root = root.left)
                val r = depth(root = root.right)

                diameter = maxOf(l + r, diameter)

                return maxOf(l, r) + 1
            }

            depth(root = root)

            return diameter
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}