package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0035SearchInsertPositionTest : AbstractSolutionTest() {

    override val solution = No0035SearchInsertPosition.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 5)
        )
        Assertions.assertEquals(
            1,
            solution.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 2)
        )
        Assertions.assertEquals(
            4,
            solution.searchInsert(nums = intArrayOf(1, 3, 5, 6), target = 7)
        )
    }
}