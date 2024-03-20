package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0096UniqueBinarySearchTreesTest : AbstractSolutionTest() {

    override val solution = No0096UniqueBinarySearchTrees.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            5,
            solution.numTrees(n = 3)
        )
        Assertions.assertEquals(
            1,
            solution.numTrees(n = 1)
        )
    }
}