package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0102BinaryTreeLevelOrderTraversalTest : AbstractSolutionTest() {

    override val solution = No0102BinaryTreeLevelOrderTraversal.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(listOf(3), listOf(9, 20), listOf(15, 7)),
            solution.levelOrder(root = treeNodeOf(3, 9, 20, null, null, 15, 7))
        )
        Assertions.assertEquals(
            listOf(listOf(1)),
            solution.levelOrder(root = treeNodeOf(1))
        )
        Assertions.assertEquals(
            emptyList<List<List<Int>>>(),
            solution.levelOrder(root = treeNodeOf())
        )
    }
}