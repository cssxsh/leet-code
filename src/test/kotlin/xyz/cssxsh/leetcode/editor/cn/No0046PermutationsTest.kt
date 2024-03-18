package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0046PermutationsTest : AbstractSolutionTest() {

    override val solution = No0046Permutations.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 1, 2),
                listOf(3, 2, 1)
            ),
            solution.permute(nums = intArrayOf(1, 2, 3))
        )
        Assertions.assertEquals(
            listOf(
                listOf(0, 1),
                listOf(1, 0)
            ),
            solution.permute(nums = intArrayOf(0, 1))
        )
        Assertions.assertEquals(
            listOf(
                listOf(1)
            ),
            solution.permute(nums = intArrayOf(1))
        )
    }
}