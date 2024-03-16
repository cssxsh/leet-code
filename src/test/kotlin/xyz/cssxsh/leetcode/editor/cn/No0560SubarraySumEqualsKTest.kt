package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0560SubarraySumEqualsKTest : AbstractSolutionTest() {

    override val solution = No0560SubarraySumEqualsK.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.subarraySum(nums = intArrayOf(1, 1, 1), k = 2)
        )
        Assertions.assertEquals(
            2,
            solution.subarraySum(nums = intArrayOf(1, 2, 3), k = 3)
        )
    }
}