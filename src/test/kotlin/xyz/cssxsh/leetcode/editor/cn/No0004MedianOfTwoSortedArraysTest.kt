package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0004MedianOfTwoSortedArraysTest : AbstractSolutionTest() {

    override val solution = No0004MedianOfTwoSortedArrays.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2.0,
            solution.findMedianSortedArrays(nums1 = intArrayOf(1, 3), nums2 = intArrayOf(2))
        )
        Assertions.assertEquals(
            2.5,
            solution.findMedianSortedArrays(nums1 = intArrayOf(1, 2), nums2 = intArrayOf(3, 4))
        )
    }
}