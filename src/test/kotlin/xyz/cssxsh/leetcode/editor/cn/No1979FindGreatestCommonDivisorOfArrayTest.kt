package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1979FindGreatestCommonDivisorOfArrayTest : AbstractSolutionTest() {

    override val solution = No1979FindGreatestCommonDivisorOfArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.findGCD(nums = intArrayOf(2, 5, 6, 9, 10))
        )
        Assertions.assertEquals(
            1,
            solution.findGCD(nums = intArrayOf(7, 5, 6, 8, 3))
        )
        Assertions.assertEquals(
            3,
            solution.findGCD(nums = intArrayOf(3, 3))
        )
    }
}