package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0486PredictTheWinnerTest : AbstractSolutionTest() {

    override val solution = No0486PredictTheWinner.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            false,
            solution.predictTheWinner(nums = intArrayOf(1, 5, 2))
        )
        Assertions.assertEquals(
            true,
            solution.predictTheWinner(nums = intArrayOf(1, 5, 233, 7))
        )
    }
}