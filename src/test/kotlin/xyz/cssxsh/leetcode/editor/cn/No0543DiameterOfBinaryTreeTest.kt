package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0543DiameterOfBinaryTreeTest : AbstractSolutionTest() {

    override val solution = No0543DiameterOfBinaryTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.diameterOfBinaryTree(root = treeNodeOf(1, 2, 3, 4, 5))
        )
        Assertions.assertEquals(
            1,
            solution.diameterOfBinaryTree(root = treeNodeOf(1, 2))
        )
    }
}