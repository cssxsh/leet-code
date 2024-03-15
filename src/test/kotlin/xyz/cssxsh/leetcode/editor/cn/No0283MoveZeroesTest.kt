package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0283MoveZeroesTest : AbstractSolutionTest() {

    override val solution = No0283MoveZeroes.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 3, 12, 0, 0),
            intArrayOf(0, 1, 0, 3, 12).also { solution.moveZeroes(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(0),
            intArrayOf(0).also { solution.moveZeroes(nums = it) }
        )
    }
}