package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0031NextPermutationTest : AbstractSolutionTest() {

    override val solution = No0031NextPermutation.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 3, 2),
            intArrayOf(1, 2, 3).also { solution.nextPermutation(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1).also { solution.nextPermutation(nums = it) }
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 5, 1),
            intArrayOf(1, 1, 5).also { solution.nextPermutation(nums = it) }
        )

    }
}