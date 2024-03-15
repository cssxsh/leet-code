package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0015ThreeSumTest : AbstractSolutionTest() {

    override val solution = No0015ThreeSum.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)),
            solution.threeSum(nums = intArrayOf(-1, 0, 1, 2, -1, -4))
        )
        Assertions.assertEquals(
            emptyList<List<Int>>(),
            solution.threeSum(nums = intArrayOf(0, 1, 1))
        )
        Assertions.assertEquals(
            listOf(listOf(0, 0, 0)),
            solution.threeSum(nums = intArrayOf(0, 0, 0))
        )
    }
}