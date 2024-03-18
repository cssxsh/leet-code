package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0581ShortestUnsortedContinuousSubarrayTest : AbstractSolutionTest() {

    override val solution = No0581ShortestUnsortedContinuousSubarray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            5,
            solution.findUnsortedSubarray(nums = intArrayOf(2, 6, 4, 8, 10, 9, 15))
        )
        Assertions.assertEquals(
            0,
            solution.findUnsortedSubarray(nums = intArrayOf(1, 2, 3, 4))
        )
        Assertions.assertEquals(
            0,
            solution.findUnsortedSubarray(nums = intArrayOf(1))
        )
    }
}