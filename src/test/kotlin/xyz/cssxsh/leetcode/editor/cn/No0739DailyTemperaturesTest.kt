package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0739DailyTemperaturesTest : AbstractSolutionTest() {

    override val solution = No0739DailyTemperatures.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
            solution.dailyTemperatures(temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 1, 1, 0),
            solution.dailyTemperatures(temperatures = intArrayOf(30, 40, 50, 60))
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 1, 0),
            solution.dailyTemperatures(temperatures = intArrayOf(30, 60, 90))
        )
    }
}