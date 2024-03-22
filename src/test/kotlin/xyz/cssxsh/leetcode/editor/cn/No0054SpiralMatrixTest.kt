package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0054SpiralMatrixTest : AbstractSolutionTest() {

    override val solution = No0054SpiralMatrix.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1, 2, 3, 6, 9, 8, 7, 4, 5),
            solution.spiralOrder(
                matrix = arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                )
            )
        )
        Assertions.assertEquals(
            listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
            solution.spiralOrder(
                matrix = arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(5, 6, 7, 8),
                    intArrayOf(9, 10, 11, 12)
                )
            )
        )
        Assertions.assertEquals(
            listOf(6, 9, 7),
            solution.spiralOrder(
                matrix = arrayOf(
                    intArrayOf(6, 9, 7)
                )
            )
        )
        Assertions.assertEquals(
            listOf(3, 4, 5),
            solution.spiralOrder(
                matrix = arrayOf(
                    intArrayOf(3),
                    intArrayOf(4),
                    intArrayOf(5)
                )
            )
        )
        Assertions.assertEquals(
            listOf(2, 3, 4, 7, 10, 13, 16, 15, 14, 11, 8, 5, 6, 9, 12),
            solution.spiralOrder(
                matrix = arrayOf(
                    intArrayOf(2, 3, 4),
                    intArrayOf(5, 6, 7),
                    intArrayOf(8, 9, 10),
                    intArrayOf(11, 12, 13),
                    intArrayOf(14, 15, 16)
                )
            )
        )
    }
}