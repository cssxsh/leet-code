package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0055JumpGameTest : AbstractSolutionTest() {

    override val solution = No0055JumpGame.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.canJump(nums = intArrayOf(2, 3, 1, 1, 4))
        )
        Assertions.assertEquals(
            false,
            solution.canJump(nums = intArrayOf(3, 2, 1, 0, 4))
        )
        Assertions.assertEquals(
            true,
            solution.canJump(nums = intArrayOf(0))
        )
        Assertions.assertEquals(
            true,
            solution.canJump(nums = intArrayOf(1))
        )
        Assertions.assertEquals(
            true,
            solution.canJump(nums = intArrayOf(0))
        )
        Assertions.assertEquals(
            false,
            solution.canJump(nums = intArrayOf(0, 1))
        )
        Assertions.assertEquals(
            true,
            solution.canJump(nums = intArrayOf(5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0))
        )
    }
}