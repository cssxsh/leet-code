package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0124BinaryTreeMaximumPathSumTest : AbstractSolutionTest() {

    override val solution = No0124BinaryTreeMaximumPathSum.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.maxPathSum(root = treeNodeOf(1, 2, 3)!!)
        )
        Assertions.assertEquals(
            42,
            solution.maxPathSum(root = treeNodeOf(-10, 9, 20, null, null, 15, 7)!!)
        )
    }
}