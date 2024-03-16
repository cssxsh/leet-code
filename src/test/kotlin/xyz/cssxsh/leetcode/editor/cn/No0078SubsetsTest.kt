package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0078SubsetsTest : AbstractSolutionTest() {

    override val solution = No0078Subsets.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                emptyList(),
                listOf(1),
                listOf(2), listOf(1, 2),
                listOf(3), listOf(1, 3), listOf(2, 3), listOf(1, 2, 3)
            ),
            solution.subsets(nums = intArrayOf(1, 2, 3))
        )
        Assertions.assertEquals(
            listOf(
                emptyList(),
                listOf(0)
            ),
            solution.subsets(nums = intArrayOf(0))
        )
    }
}