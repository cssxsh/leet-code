package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0324WiggleSortIiTest : AbstractSolutionTest() {

    override val solution = No0324WiggleSortIi.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 6, 1, 5, 1, 4),
            intArrayOf(1, 5, 1, 1, 6, 4)
                .also { solution.wiggleSort(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(2, 3, 1, 3, 1, 2),
            intArrayOf(1, 3, 2, 2, 3, 1)
                .also { solution.wiggleSort(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 1, 2, 1, 2, 1),
            intArrayOf(1, 1, 2, 1, 2, 2, 1)
                .also { solution.wiggleSort(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(8, 17, 7, 16, 6, 15, 5, 14, 4, 13, 3, 12, 2, 11, 1, 10, 0, 9),
            intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
                .also { solution.wiggleSort(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1),
            intArrayOf(1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2)
                .also { solution.wiggleSort(nums = it) }
        )
    }
}