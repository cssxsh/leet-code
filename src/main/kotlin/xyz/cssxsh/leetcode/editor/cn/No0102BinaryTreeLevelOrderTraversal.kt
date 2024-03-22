package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0102BinaryTreeLevelOrderTraversal {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun levelOrder(root: TreeNode?): List<List<Int>> {
            if (root == null) return emptyList()

            val result = mutableListOf<List<Int>>()
            val queue = ArrayDeque<TreeNode?>()
            queue.addLast(element = root)
            queue.addLast(element = null)

            var level = mutableListOf<Int>()
            while (queue.isEmpty().not()) {
                val node = queue.removeFirst()
                if (node == null) {
                    result.add(element = level)
                    level = mutableListOf()
                    if (queue.isEmpty()) break
                    queue.addLast(element = null)
                    continue
                }

                level.add(element = node.`val`)

                for (child in sequenceOf(node.left, node.right)) {
                    if (child == null) continue
                    queue.addLast(element = child)
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}