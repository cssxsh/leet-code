package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1342NumberOfStepsToReduceANumberToZeroTest : AbstractSolutionTest() {

    override val solution = No1342NumberOfStepsToReduceANumberToZero.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.numberOfSteps(num = 14)
        )
        Assertions.assertEquals(
            4,
            solution.numberOfSteps(num = 8)
        )
        Assertions.assertEquals(
            12,
            solution.numberOfSteps(num = 123)
        )
    }
}