package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0041FirstMissingPositiveTest : AbstractSolutionTest() {

    override val solution = No0041FirstMissingPositive.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.firstMissingPositive(nums = intArrayOf(1, 2, 0))
        )
        Assertions.assertEquals(
            2,
            solution.firstMissingPositive(nums = intArrayOf(3, 4, -1, 1))
        )
        Assertions.assertEquals(
            1,
            solution.firstMissingPositive(nums = intArrayOf(7, 8, 9, 11, 12))
        )
    }
}