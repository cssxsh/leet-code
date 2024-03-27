package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0103BinaryTreeZigzagLevelOrderTraversalTest : AbstractSolutionTest() {

    override val solution = No0103BinaryTreeZigzagLevelOrderTraversal.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(listOf(3), listOf(20, 9), listOf(15, 7)),
            solution.zigzagLevelOrder(root = treeNodeOf(3, 9, 20, null, null, 15, 7))
        )
        Assertions.assertEquals(
            listOf(listOf(1)),
            solution.zigzagLevelOrder(root = treeNodeOf(1))
        )
        Assertions.assertEquals(
            emptyList<List<Int>>(),
            solution.zigzagLevelOrder(root = treeNodeOf())
        )
    }
}