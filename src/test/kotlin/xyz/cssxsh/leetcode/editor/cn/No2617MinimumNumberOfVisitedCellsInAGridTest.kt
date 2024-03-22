package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2617MinimumNumberOfVisitedCellsInAGridTest : AbstractSolutionTest() {

    override val solution = No2617MinimumNumberOfVisitedCellsInAGrid.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.minimumVisitedCells(
                grid = arrayOf(
                    intArrayOf(3, 4, 2, 1),
                    intArrayOf(4, 2, 3, 1),
                    intArrayOf(2, 1, 0, 0),
                    intArrayOf(2, 4, 0, 0)
                )
            )
        )
        Assertions.assertEquals(
            3,
            solution.minimumVisitedCells(
                grid = arrayOf(
                    intArrayOf(3, 4, 2, 1),
                    intArrayOf(4, 2, 1, 1),
                    intArrayOf(2, 1, 1, 0),
                    intArrayOf(3, 4, 1, 0)
                )
            )
        )
        Assertions.assertEquals(
            -1,
            solution.minimumVisitedCells(
                grid = arrayOf(
                    intArrayOf(2, 1, 0),
                    intArrayOf(1, 0, 0)
                )
            )
        )
    }
}