package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2684MaximumNumberOfMovesInAGridTest : AbstractSolutionTest() {

    override val solution = No2684MaximumNumberOfMovesInAGrid.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.maxMoves(
                grid = arrayOf(
                    intArrayOf(2, 4, 3, 5),
                    intArrayOf(5, 4, 9, 3),
                    intArrayOf(3, 4, 2, 11),
                    intArrayOf(10, 9, 13, 15)
                )
            )
        )
        Assertions.assertEquals(
            0,
            solution.maxMoves(
                grid = arrayOf(
                    intArrayOf(3, 2, 4),
                    intArrayOf(2, 1, 9),
                    intArrayOf(1, 1, 7)
                )
            )
        )
    }
}