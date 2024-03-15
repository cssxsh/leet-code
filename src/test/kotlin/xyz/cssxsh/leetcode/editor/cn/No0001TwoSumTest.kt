package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0001TwoSumTest : AbstractSolutionTest() {

    override val solution = No0001TwoSum.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(0, 1),
            solution.twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 2),
            solution.twoSum(nums = intArrayOf(3, 2, 4), target = 6)
        )
        Assertions.assertArrayEquals(
            intArrayOf(0, 1),
            solution.twoSum(nums = intArrayOf(3, 3), target = 6)
        )
    }
}