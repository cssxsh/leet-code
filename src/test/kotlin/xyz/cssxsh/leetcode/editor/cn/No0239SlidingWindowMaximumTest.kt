package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0239SlidingWindowMaximumTest : AbstractSolutionTest() {

    override val solution = No0239SlidingWindowMaximum.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(3, 3, 5, 5, 6, 7),
            solution.maxSlidingWindow(
                nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7),
                k = 3
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(1),
            solution.maxSlidingWindow(
                nums = intArrayOf(1),
                k = 1
            )
        )
    }
}