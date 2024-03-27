package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0321CreateMaximumNumberTest : AbstractSolutionTest() {

    override val solution = No0321CreateMaximumNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(9, 8, 6, 5, 3),
            solution.maxNumber(
                nums1 = intArrayOf(3, 4, 6, 5),
                nums2 = intArrayOf(9, 1, 2, 5, 8, 3),
                k = 5
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(6, 7, 6, 0, 4),
            solution.maxNumber(
                nums1 = intArrayOf(6, 7),
                nums2 = intArrayOf(6, 0, 4),
                k = 5
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(9, 8, 9),
            solution.maxNumber(
                nums1 = intArrayOf(3, 9),
                nums2 = intArrayOf(8, 9),
                k = 3
            )
        )
    }
}