package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0034FindFirstAndLastPositionOfElementInSortedArrayTest : AbstractSolutionTest() {

    override val solution = No0034FindFirstAndLastPositionOfElementInSortedArray.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(3, 4),
            solution.searchRange(
                nums = intArrayOf(5, 7, 7, 8, 8, 10),
                target = 8
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(-1, -1),
            solution.searchRange(
                nums = intArrayOf(5, 7, 7, 8, 8, 10),
                target = 6
            )
        )
        Assertions.assertArrayEquals(
            intArrayOf(-1, -1),
            solution.searchRange(
                nums = intArrayOf(),
                target = 0
            )
        )
    }
}