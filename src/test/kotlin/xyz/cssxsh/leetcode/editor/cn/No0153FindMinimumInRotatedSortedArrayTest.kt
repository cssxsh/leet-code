package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0153FindMinimumInRotatedSortedArrayTest : AbstractSolutionTest() {

    override val solution = No0153FindMinimumInRotatedSortedArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.findMin(nums = intArrayOf(3, 4, 5, 1, 2))
        )
        Assertions.assertEquals(
            0,
            solution.findMin(nums = intArrayOf(4, 5, 6, 7, 0, 1, 2))
        )
        Assertions.assertEquals(
            11,
            solution.findMin(nums = intArrayOf(11, 13, 15, 17))
        )
    }
}