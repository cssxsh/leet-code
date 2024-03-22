package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0226InvertBinaryTreeTest : AbstractSolutionTest() {

    override val solution = No0226InvertBinaryTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(4, 7, 2, 9, 6, 3, 1),
            solution.invertTree(root = treeNodeOf(4, 2, 7, 1, 3, 6, 9))
        )
        Assertions.assertEquals(
            treeNodeOf(2, 1, 3),
            solution.invertTree(root = treeNodeOf(2, 3, 1))
        )
        Assertions.assertEquals(
            null as TreeNode?,
            solution.invertTree(root = null as TreeNode?)
        )
    }
}