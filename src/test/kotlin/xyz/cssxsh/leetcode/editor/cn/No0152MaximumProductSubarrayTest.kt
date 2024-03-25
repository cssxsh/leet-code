package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0152MaximumProductSubarrayTest : AbstractSolutionTest() {

    override val solution = No0152MaximumProductSubarray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.maxProduct(nums = intArrayOf(2, 3, -2, 4))
        )
        Assertions.assertEquals(
            0,
            solution.maxProduct(nums = intArrayOf(-2, 0, -1))
        )
    }
}