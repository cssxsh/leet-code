package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0053MaximumSubarrayTest : AbstractSolutionTest() {

    override val solution = No0053MaximumSubarray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.maxSubArray(nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
        )
        Assertions.assertEquals(
            1,
            solution.maxSubArray(nums = intArrayOf(1))
        )
        Assertions.assertEquals(
            23,
            solution.maxSubArray(nums = intArrayOf(5, 4, -1, 7, 8))
        )
    }
}