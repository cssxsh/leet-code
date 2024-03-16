package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0094BinaryTreeInorderTraversalTest : AbstractSolutionTest() {

    override val solution = No0094BinaryTreeInorderTraversal.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1, 3, 2),
            solution.inorderTraversal(root = treeNodeOf(1, null, 2, 3))
        )
        Assertions.assertEquals(
            emptyList<Int>(),
            solution.inorderTraversal(root = treeNodeOf())
        )
        Assertions.assertEquals(
            listOf(1),
            solution.inorderTraversal(root = treeNodeOf(1))
        )
    }
}