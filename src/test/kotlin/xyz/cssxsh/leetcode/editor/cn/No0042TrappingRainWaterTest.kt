package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0042TrappingRainWaterTest : AbstractSolutionTest() {

    override val solution = No0042TrappingRainWater.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.trap(height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
        )
        Assertions.assertEquals(
            9,
            solution.trap(height = intArrayOf(4, 2, 0, 3, 2, 5))
        )
    }
}
