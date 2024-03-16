package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0104MaximumDepthOfBinaryTreeTest : AbstractSolutionTest() {

    override val solution = No0104MaximumDepthOfBinaryTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.maxDepth(root = treeNodeOf(3, 9, 20, null, null, 15, 7))
        )
        Assertions.assertEquals(
            2,
            solution.maxDepth(root = treeNodeOf(1, null, 2))
        )
    }
}