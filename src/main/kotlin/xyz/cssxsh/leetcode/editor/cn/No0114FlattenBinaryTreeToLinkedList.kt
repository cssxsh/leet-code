package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0114FlattenBinaryTreeToLinkedList {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun flatten(root: TreeNode?) {
            link(node = root ?: return)
        }

        private fun link(node: TreeNode): TreeNode {
            val left = node.left
            val right = node.right

            var tail = node
            tail.left = null
            tail.right = null
            if (left != null) {
                tail.right = left
                tail = link(node = left)
            }
            if (right != null) {
                tail.right = right
                tail = link(node = right)
            }

            return tail
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}