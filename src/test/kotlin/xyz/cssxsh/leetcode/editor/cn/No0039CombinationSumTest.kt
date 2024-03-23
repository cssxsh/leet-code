package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0039CombinationSumTest : AbstractSolutionTest() {

    override val solution = No0039CombinationSum.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf(2, 2, 3),
                listOf(7)
            ),
            solution.combinationSum(
                candidates = intArrayOf(2, 3, 6, 7),
                target = 7
            )
        )
        Assertions.assertEquals(
            listOf(
                listOf(2, 2, 2, 2),
                listOf(2, 3, 3),
                listOf(3, 5)
            ),
            solution.combinationSum(
                candidates = intArrayOf(2, 3, 5),
                target = 8
            )
        )
        Assertions.assertEquals(
            emptyList<Int>(),
            solution.combinationSum(
                candidates = intArrayOf(2),
                target = 1
            )
        )
    }
}