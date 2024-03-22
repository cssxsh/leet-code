package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0101SymmetricTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isSymmetric(root: TreeNode?): Boolean {
            if (root == null) return false
            return dfs(left = root.left, right = root.right)
        }

        private fun dfs(left: TreeNode?, right: TreeNode?): Boolean {
            if (left == null && right == null) return true
            if (left == null || right == null) return false
            if (left.`val` != right.`val`) return false
            return dfs(left = left.left, right = right.right) && dfs(left = left.right, right = right.left)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}