package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0617MergeTwoBinaryTrees {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
            if (root1 == null) return root2
            if (root2 == null) return root1

            val tree = ArrayDeque<TreeNode>()
            val root = TreeNode(root1.`val` + root2.`val`)
            tree.addLast(element = root)

            val tree1 = ArrayDeque<TreeNode?>()
            tree1.addLast(element = root1)

            val tree2 = ArrayDeque<TreeNode?>()
            tree2.addLast(element = root2)

            while (tree.isEmpty().not()) {
                val node = tree.removeFirst()
                val node1 = tree1.removeFirst()
                val node2 = tree2.removeFirst()

                val left1 = node1?.left
                val left2 = node2?.left
                if (left1 != null || left2 != null) {
                    val left = TreeNode((left1?.`val` ?: 0) + (left2?.`val` ?: 0))
                    node.left = left

                    tree.addLast(element = left)
                    tree1.addLast(element = left1)
                    tree2.addLast(element = left2)
                }

                val right1 = node1?.right
                val right2 = node2?.right
                if (right1 != null || right2 != null) {
                    val right = TreeNode((right1?.`val` ?: 0) + (right2?.`val` ?: 0))
                    node.right = right

                    tree.addLast(element = right)
                    tree1.addLast(element = right1)
                    tree2.addLast(element = right2)
                }
            }

            return root
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}