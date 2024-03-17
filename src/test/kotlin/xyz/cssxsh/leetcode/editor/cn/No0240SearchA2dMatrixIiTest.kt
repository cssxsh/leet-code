package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0240SearchA2dMatrixIiTest : AbstractSolutionTest() {

    override val solution = No0240SearchA2dMatrixIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.searchMatrix(
                matrix = arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ),
                target = 5
            )
        )
        Assertions.assertEquals(
            false,
            solution.searchMatrix(
                matrix = arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ),
                target = 20
            )
        )
    }
}