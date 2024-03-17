package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.treeNodeOf

internal class No0297SerializeAndDeserializeBinaryTreeTest : AbstractSolutionTest() {

    override val solution = No0297SerializeAndDeserializeBinaryTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(1, 2, 3, null, null, 4, 5),
            solution.codec(root = treeNodeOf(1, 2, 3, null, null, 4, 5))
        )
        Assertions.assertEquals(
            treeNodeOf(),
            solution.codec(root = treeNodeOf())
        )
        Assertions.assertEquals(
            treeNodeOf(1),
            solution.codec(root = treeNodeOf(1))
        )
        Assertions.assertEquals(
            treeNodeOf(1, 2),
            solution.codec(root = treeNodeOf(1, 2))
        )
        Assertions.assertEquals(
            treeNodeOf(1, null, 2),
            solution.codec(root = treeNodeOf(1, null, 2))
        )
        Assertions.assertEquals(
            treeNodeOf(1, 2, 3, null, null, 4, 5, 6, 7),
            solution.codec(root = treeNodeOf(1, 2, 3, null, null, 4, 5, 6, 7))
        )
    }
}