package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0118PascalsTriangleTest : AbstractSolutionTest() {

    override val solution = No0118PascalsTriangle.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf(1),
                listOf(1, 1),
                listOf(1, 2, 1),
                listOf(1, 3, 3, 1),
                listOf(1, 4, 6, 4, 1)
            ),
            solution.generate(numRows = 5)
        )
        Assertions.assertEquals(
            listOf(
                listOf(1)
            ),
            solution.generate(numRows = 1)
        )
    }
}