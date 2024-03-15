package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0011ContainerWithMostWaterTest : AbstractSolutionTest() {

    override val solution = No0011ContainerWithMostWater.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            49,
            solution.maxArea(height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
        )
        Assertions.assertEquals(
            1,
            solution.maxArea(height = intArrayOf(1, 1))
        )
    }
}