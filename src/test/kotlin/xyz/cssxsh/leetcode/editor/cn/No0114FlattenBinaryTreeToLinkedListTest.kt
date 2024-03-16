package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0114FlattenBinaryTreeToLinkedListTest : AbstractSolutionTest() {

    override val solution = No0114FlattenBinaryTreeToLinkedList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(1, null, 2, null, 3, null, 4, null, 5, null, 6),
            treeNodeOf(1, null, 2, null, 3, null, 4, null, 5, null, 6).also { solution.flatten(root = it) }
        )
        Assertions.assertEquals(
            treeNodeOf(),
            treeNodeOf().also { solution.flatten(root = it) }
        )
        Assertions.assertEquals(
            treeNodeOf(0),
            treeNodeOf(0).also { solution.flatten(root = it) }
        )
    }
}