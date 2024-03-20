package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0279PerfectSquaresTest : AbstractSolutionTest() {

    override val solution = No0279PerfectSquares.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.numSquares(n = 12)
        )
        Assertions.assertEquals(
            2,
            solution.numSquares(n = 13)
        )
    }
}