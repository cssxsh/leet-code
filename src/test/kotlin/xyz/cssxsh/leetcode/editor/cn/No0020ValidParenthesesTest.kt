package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0020ValidParenthesesTest : AbstractSolutionTest() {

    override val solution = No0020ValidParentheses.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isValid(s = "()")
        )
        Assertions.assertEquals(
            true,
            solution.isValid(s = "()[]{}")
        )
        Assertions.assertEquals(
            false,
            solution.isValid(s = "(]")
        )
    }
}