package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0437PathSumIii {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun pathSum(root: TreeNode?, targetSum: Int): Int {
            if (root == null) return 0

            var result = 0

//            fun dfs(root: TreeNode?, target: Long): Int {
//                if (root == null) return 0
//                val residue = target - root.`val`
//                var count = 0
//                if (residue == 0L) count++
//                count += dfs(root = root.left, target = residue)
//                count += dfs(root = root.right, target = residue)
//
//                return count
//            }
//
//            val queue = ArrayDeque<TreeNode>()
//            queue.addLast(element = root)
//            while (queue.isEmpty().not()) {
//                val node = queue.removeFirst()
//                result += dfs(root = node, target = targetSum.toLong())
//                for (child in sequenceOf(node.left, node.right)) {
//                    if (child == null) continue
//                    queue.addLast(element = child)
//                }
//            }

            val prefix = hashMapOf<Long, Int>()

            fun dfs(root: TreeNode?, prev: Long): Int {
                if (root == null) return 0

                val current = prev + root.`val`
                var count = prefix[current - targetSum] ?: 0

                prefix[current] = (prefix[current] ?: 0) + 1
                count += dfs(root = root.left, prev = current)
                count += dfs(root = root.right, prev = current)
                prefix[current] = (prefix[current] ?: 0) - 1

                return count
            }

            prefix[0] = 1
            result = dfs(root = root, prev = 0)

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}