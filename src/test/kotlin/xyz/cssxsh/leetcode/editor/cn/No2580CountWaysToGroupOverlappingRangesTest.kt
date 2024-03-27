package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2580CountWaysToGroupOverlappingRangesTest : AbstractSolutionTest() {

    override val solution = No2580CountWaysToGroupOverlappingRanges.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.countWays(
                ranges = arrayOf(
                    intArrayOf(6, 10),
                    intArrayOf(5, 15)
                )
            )
        )
        Assertions.assertEquals(
            4,
            solution.countWays(
                ranges = arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(10, 20),
                    intArrayOf(2, 5),
                    intArrayOf(4, 8)
                )
            )
        )
        Assertions.assertEquals(
            2,
            solution.countWays(
                ranges = arrayOf(
                    intArrayOf(34, 56),
                    intArrayOf(28, 29),
                    intArrayOf(12, 16),
                    intArrayOf(11, 48),
                    intArrayOf(28, 54),
                    intArrayOf(22, 55),
                    intArrayOf(28, 41),
                    intArrayOf(41, 44)
                )
            )
        )
    }
}