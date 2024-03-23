package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0074SearchA2dMatrixTest : AbstractSolutionTest() {

    override val solution = No0074SearchA2dMatrix.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.searchMatrix(
                matrix = arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ),
                target = 3
            )
        )
        Assertions.assertEquals(
            false,
            solution.searchMatrix(
                matrix = arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 60)
                ),
                target = 13
            )
        )
    }
}