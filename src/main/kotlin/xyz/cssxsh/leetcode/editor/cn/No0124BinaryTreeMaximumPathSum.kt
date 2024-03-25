package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0124BinaryTreeMaximumPathSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxPathSum(root: TreeNode): Int {
            var max = Int.MIN_VALUE

            fun dfs(node: TreeNode?): Int {
                if (node == null) return 0

                val left = maxOf(dfs(node.left), 0)
                val right = maxOf(dfs(node.right), 0)
                val path = node.`val` + left + right

                max = maxOf(path, max)

                return node.`val` + maxOf(left, right)
            }

            dfs(node = root)

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}