package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0088MergeSortedArrayTest : AbstractSolutionTest() {

    override val solution = No0088MergeSortedArray.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            intArrayOf(1, 7, 8, 9, 0, 0, 0, 0, 0).also { nums ->
                solution.merge(
                    nums1 = nums,
                    m = 4,
                    nums2 = intArrayOf(2, 3, 4, 5, 6),
                    n = 5
                )
            }
        )
    }
}