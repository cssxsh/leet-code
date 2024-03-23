package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0045JumpGameIiTest : AbstractSolutionTest() {

    override val solution = No0045JumpGameIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.jump(nums = intArrayOf(2, 3, 1, 1, 4))
        )
        Assertions.assertEquals(
            2,
            solution.jump(nums = intArrayOf(2, 3, 0, 1, 4))
        )
    }
}