package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0069SqrtxTest : AbstractSolutionTest() {

    override val solution = No0069Sqrtx.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.mySqrt(x = 4)
        )
        Assertions.assertEquals(
            2,
            solution.mySqrt(x = 8)
        )
    }
}