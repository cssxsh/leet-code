package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0268MissingNumberTest : AbstractSolutionTest() {

    override val solution = No0268MissingNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.missingNumber(nums = intArrayOf(3, 0, 1))
        )
        Assertions.assertEquals(
            2,
            solution.missingNumber(nums = intArrayOf(0, 1))
        )
        Assertions.assertEquals(
            8,
            solution.missingNumber(nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))
        )
        Assertions.assertEquals(
            1,
            solution.missingNumber(nums = intArrayOf(0))
        )
    }
}