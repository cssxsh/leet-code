package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2310SumOfNumbersWithUnitsDigitKTest : AbstractSolutionTest() {

    override val solution = No2310SumOfNumbersWithUnitsDigitK.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.minimumNumbers(num = 58, k = 9)
        )
        Assertions.assertEquals(
            -1,
            solution.minimumNumbers(num = 37, k = 2)
        )
        Assertions.assertEquals(
            0,
            solution.minimumNumbers(num = 0, k = 7)
        )
    }
}