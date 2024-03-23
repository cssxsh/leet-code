package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2549CountDistinctNumbersOnBoardTest : AbstractSolutionTest() {

    override val solution = No2549CountDistinctNumbersOnBoard.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.distinctIntegers(n = 5)
        )
        Assertions.assertEquals(
            2,
            solution.distinctIntegers(n = 3)
        )
    }
}