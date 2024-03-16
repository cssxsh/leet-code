package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0094BinaryTreeInorderTraversal {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun inorderTraversal(root: TreeNode?): List<Int> {
            val stack = ArrayDeque<TreeNode>()
            val result = mutableListOf<Int>()
            var node = root
            while (node != null || stack.isEmpty().not()) {
                while (node != null) {
                    stack.addLast(element = node)
                    node = node.left
                }
                node = stack.removeLast()
                result.add(element = node.`val`)
                node = node.right
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}