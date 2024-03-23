package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0236LowestCommonAncestorOfABinaryTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        @PublishedApi
        internal fun test(root: TreeNode?, p: Int, q: Int): TreeNode? {
            if (root == null) return null

            var a = null as TreeNode?
            var b = null as TreeNode?
            val queue = ArrayDeque<TreeNode>()
            queue.addLast(element = root)
            while (queue.isEmpty().not()) {
                val node = queue.removeFirst()
                if (node.`val` == p) a = node
                if (node.`val` == q) b = node
                if (a != null && b != null) break
                for (child in sequenceOf(node.left, node.right)) {
                    if (child == null) continue
                    queue.addLast(element = child)
                }
            }

            return lowestCommonAncestor(root = root, p = a!!, q = b!!)
        }

        fun lowestCommonAncestor(root: TreeNode, p: TreeNode?, q: TreeNode?): TreeNode {
            if (p == null) return root
            if (q == null) return root
            var result = null as TreeNode?

            fun dfs(root: TreeNode?): Int {
                if (root == null) return 0

                var record = when (root.`val`) {
                    p.`val` -> 0x01
                    q.`val` -> 0x02
                    else -> 0x00
                }

                record = record or dfs(root = root.left)
                if (record == 0x03) {
                    result = result ?: root
                    return 0x03
                }

                record = record or dfs(root = root.right)
                if (record == 0x03) {
                    result = result ?: root
                    return 0x03
                }

                return record
            }

            dfs(root = root)

            return result ?: root
        }

        fun ancestor(root: TreeNode, vararg nodes: TreeNode): List<List<TreeNode>> {
            val stack = ArrayDeque<TreeNode>()
            val targets = nodes.toMutableList()
            val routes = ArrayList<List<TreeNode>>()

            fun dfs(root: TreeNode) {
                stack.addLast(element = root)

                for (i in targets.indices) {
                    if (root !== targets[i]) continue
                    routes.add(element = stack.toList())
                    targets.removeAt(i)
                    break
                }
                if (targets.isEmpty()) return

                val left = root.left
                if (left != null) dfs(root = left)
                val right = root.right
                if (right != null) dfs(root = right)
                stack.removeLast()
            }

            dfs(root = root)

            return routes
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}