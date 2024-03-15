package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0136SingleNumberTest : AbstractSolutionTest() {

    override val solution = No0136SingleNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.singleNumber(nums = intArrayOf(2, 2, 1))
        )
        Assertions.assertEquals(
            4,
            solution.singleNumber(nums = intArrayOf(4, 1, 2, 1, 2))
        )
        Assertions.assertEquals(
            1,
            solution.singleNumber(nums = intArrayOf(1))
        )
    }
}