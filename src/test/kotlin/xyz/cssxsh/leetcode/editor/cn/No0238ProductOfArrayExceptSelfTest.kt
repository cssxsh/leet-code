package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0238ProductOfArrayExceptSelfTest : AbstractSolutionTest() {

    override val solution = No0238ProductOfArrayExceptSelf.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(24, 12, 8, 6),
            solution.productExceptSelf(nums = intArrayOf(1, 2, 3, 4))
        )
        Assertions.assertArrayEquals(
            intArrayOf(0, 0, 9, 0, 0),
            solution.productExceptSelf(nums = intArrayOf(-1, 1, 0, -3, 3))
        )
    }
}