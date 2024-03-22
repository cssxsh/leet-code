package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0105ConstructBinaryTreeFromPreorderAndInorderTraversal {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
            val n = inorder.size
            val map = hashMapOf<Int, Int>()
            for (i in 0 until n) map[inorder[i]] = i

            fun build(pl: Int, pr: Int, il: Int, ir: Int): TreeNode? {
                if (pl > pr) return null
                val root = preorder[pl]
                val index = map[root]!!

                val node = TreeNode(root)
                val num = index - il
                node.left = build(pl = pl + 1, pr = pl + num, il = il, ir = index - 1)
                node.right = build(pl = pl + num + 1, pr = pr, il = index + 1, ir = ir)

                return node
            }

            return build(pl = 0, pr = n - 1, il = 0, ir = n - 1)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}