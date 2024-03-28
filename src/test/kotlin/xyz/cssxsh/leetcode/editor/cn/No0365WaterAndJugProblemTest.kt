package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0365WaterAndJugProblemTest : AbstractSolutionTest() {

    override val solution = No0365WaterAndJugProblem.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.canMeasureWater(
                x = 3,
                y = 5,
                target = 4
            )
        )
        Assertions.assertEquals(
            false,
            solution.canMeasureWater(
                x = 2,
                y = 6,
                target = 5
            )
        )
        Assertions.assertEquals(
            true,
            solution.canMeasureWater(
                x = 1,
                y = 2,
                target = 3
            )
        )
    }
}