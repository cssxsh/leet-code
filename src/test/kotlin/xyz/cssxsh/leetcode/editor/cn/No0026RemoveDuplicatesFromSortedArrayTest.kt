package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0026RemoveDuplicatesFromSortedArrayTest : AbstractSolutionTest() {

    override val solution = No0026RemoveDuplicatesFromSortedArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1, 2),
            intArrayOf(1, 1, 2)
                .also { solution.removeDuplicates(nums = it) }
                .slice(0 until 2)
        )
        Assertions.assertEquals(
            listOf(0, 1, 2, 3, 4),
            intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
                .also { solution.removeDuplicates(nums = it) }
                .slice(0 until 5)
        )
    }
}