package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0718MaximumLengthOfRepeatedSubarrayTest : AbstractSolutionTest() {

    override val solution = No0718MaximumLengthOfRepeatedSubarray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.findLength(
                nums1 = intArrayOf(1, 2, 3, 2, 1),
                nums2 = intArrayOf(3, 2, 1, 4, 7)
            )
        )
        Assertions.assertEquals(
            5,
            solution.findLength(
                nums1 = intArrayOf(0, 0, 0, 0, 0),
                nums2 = intArrayOf(0, 0, 0, 0, 0)
            )
        )
        Assertions.assertEquals(
            2,
            solution.findLength(
                nums1 = intArrayOf(0, 1, 1, 1, 1),
                nums2 = intArrayOf(1, 0, 1, 0, 1)
            )
        )
        Assertions.assertEquals(
            3,
            solution.findLength(
                nums1 = intArrayOf(1, 0, 0, 0, 1),
                nums2 = intArrayOf(1, 0, 0, 1, 1)
            )
        )
        Assertions.assertEquals(
            1,
            solution.findLength(
                nums1 = intArrayOf(1, 2, 3, 4, 5),
                nums2 = intArrayOf(9, 8, 7, 6, 5)
            )
        )
    }

}