package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0215KthLargestElementInAnArrayTest : AbstractSolutionTest() {

    override val solution = No0215KthLargestElementInAnArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            5,
            solution.findKthLargest(nums = intArrayOf(3, 2, 1, 5, 6, 4), k = 2)
        )
        Assertions.assertEquals(
            4,
            solution.findKthLargest(nums = intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), k = 4)
        )
    }
}