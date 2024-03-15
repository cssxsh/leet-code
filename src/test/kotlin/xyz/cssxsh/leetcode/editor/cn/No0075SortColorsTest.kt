package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0075SortColorsTest : AbstractSolutionTest() {

    override val solution = No0075SortColors.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(0, 0, 1, 1, 2, 2),
            intArrayOf(2, 0, 2, 1, 1, 0).also { solution.sortColors(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(0, 0, 1, 1, 2, 2),
            intArrayOf(2, 0, 2, 1, 1, 0).also { solution.sortColors(nums = it) }
        )
    }
}