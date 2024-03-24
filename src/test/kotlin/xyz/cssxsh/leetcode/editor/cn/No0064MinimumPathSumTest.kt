package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0064MinimumPathSumTest : AbstractSolutionTest() {

    override val solution = No0064MinimumPathSum.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            7,
            solution.minPathSum(
                grid = arrayOf(
                    intArrayOf(1, 3, 1),
                    intArrayOf(1, 5, 1),
                    intArrayOf(4, 2, 1)
                )
            )
        )
        Assertions.assertEquals(
            12,
            solution.minPathSum(
                grid = arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6)
                )
            )
        )
    }
}