package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0349IntersectionOfTwoArraysTest : AbstractSolutionTest() {

    override val solution = No0349IntersectionOfTwoArrays.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(2),
            solution.intersection(
                nums1 = intArrayOf(1, 2, 2, 1),
                nums2 = intArrayOf(2, 2)
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(4, 9),
            solution.intersection(
                nums1 = intArrayOf(4, 9, 5),
                nums2 = intArrayOf(9, 4, 9, 8, 4)
            )
        )
    }
}