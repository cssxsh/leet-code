package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0098ValidateBinarySearchTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isValidBST(root: TreeNode?): Boolean {
            if (root == null) return true
            val stack = ArrayDeque<TreeNode>()
            var prev = root
            var flag = null as Int?
            while (true) {
                if (prev == null) {
                    if (stack.isEmpty()) break
                    val node = stack.removeLast()
                    if (flag != null && node.`val` <= flag) return false
                    flag = node.`val`
                    prev = node.right
                    continue
                }
                stack.addLast(element = prev)
                prev = prev.left
            }

            return true
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}