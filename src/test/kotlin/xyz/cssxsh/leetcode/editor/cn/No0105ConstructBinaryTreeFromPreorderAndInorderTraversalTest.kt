package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0105ConstructBinaryTreeFromPreorderAndInorderTraversalTest : AbstractSolutionTest() {

    override val solution = No0105ConstructBinaryTreeFromPreorderAndInorderTraversal.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(3, 9, 20, null, null, 15, 7),
            solution.buildTree(
                preorder = intArrayOf(3, 9, 20, 15, 7),
                inorder = intArrayOf(9, 3, 15, 20, 7)
            )
        )
        Assertions.assertEquals(
            treeNodeOf(-1),
            solution.buildTree(
                preorder = intArrayOf(-1),
                inorder = intArrayOf(-1)
            )
        )
    }
}