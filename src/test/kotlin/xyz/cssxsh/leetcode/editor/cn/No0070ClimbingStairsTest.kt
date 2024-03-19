package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0070ClimbingStairsTest : AbstractSolutionTest() {

    override val solution = No0070ClimbingStairs.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.climbStairs(n = 2)
        )
        Assertions.assertEquals(
            3,
            solution.climbStairs(n = 3)
        )
    }
}