package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0189RotateArrayTest : AbstractSolutionTest() {

    override val solution = No0189RotateArray.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(5, 6, 7, 1, 2, 3, 4),
            intArrayOf(1, 2, 3, 4, 5, 6, 7).also { solution.rotate(nums = it, k = 3) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(3, 99, -1, -100),
            intArrayOf(-1, -100, 3, 99).also { solution.rotate(nums = it, k = 2) }
        )
    }
}