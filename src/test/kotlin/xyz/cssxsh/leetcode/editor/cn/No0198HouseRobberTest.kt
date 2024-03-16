package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0198HouseRobberTest : AbstractSolutionTest() {

    override val solution = No0198HouseRobber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.rob(nums = intArrayOf(1, 2, 3, 1))
        )
        Assertions.assertEquals(
            12,
            solution.rob(nums = intArrayOf(2, 7, 9, 3, 1))
        )
    }
}