package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0287FindTheDuplicateNumberTest : AbstractSolutionTest() {

    override val solution = No0287FindTheDuplicateNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.findDuplicate(nums = intArrayOf(1, 3, 4, 2, 2))
        )
        Assertions.assertEquals(
            3,
            solution.findDuplicate(nums = intArrayOf(3, 1, 3, 4, 2))
        )
        Assertions.assertEquals(
            3,
            solution.findDuplicate(nums = intArrayOf(3, 3, 3, 3, 3))
        )
    }
}