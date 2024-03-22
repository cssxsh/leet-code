package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0073SetMatrixZeroesTest : AbstractSolutionTest() {

    override val solution = No0073SetMatrixZeroes.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0),
                intArrayOf(1, 0, 1)
            ),
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
            ).also { solution.setZeroes(matrix = it) }
        )
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(0, 0, 0, 0),
                intArrayOf(0, 4, 5, 0),
                intArrayOf(0, 3, 1, 0)
            ),
            arrayOf(
                intArrayOf(0, 1, 2, 0),
                intArrayOf(3, 4, 5, 2),
                intArrayOf(1, 3, 1, 5)
            ).also { solution.setZeroes(matrix = it) }
        )
    }
}