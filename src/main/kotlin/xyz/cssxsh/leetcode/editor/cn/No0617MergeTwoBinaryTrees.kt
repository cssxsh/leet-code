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

            fun sum(node1: TreeNode?, node2: TreeNode?): TreeNode? {
                if (node1 != null || node2 != null) {
                    val result = TreeNode((node1?.`val` ?: 0) + (node2?.`val` ?: 0))

                    tree.addLast(element = result)
                    tree1.addLast(element = node1)
                    tree2.addLast(element = node2)

                    return result
                }
                return null
            }

            while (tree.isEmpty().not()) {
                val node = tree.removeFirst()
                val node1 = tree1.removeFirst()
                val node2 = tree2.removeFirst()

                node.left = sum(node1 = node1?.left, node2 = node2?.left)
                node.right = sum(node1 = node1?.right, node2 = node2?.right)
            }

            return root
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}