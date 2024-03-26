package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0263UglyNumberTest : AbstractSolutionTest() {

    override val solution = No0263UglyNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isUgly(n = 6)
        )
        Assertions.assertEquals(
            true,
            solution.isUgly(n = 1)
        )
        Assertions.assertEquals(
            false,
            solution.isUgly(n = 14)
        )
    }
}