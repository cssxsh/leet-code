package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0301RemoveInvalidParenthesesTest : AbstractSolutionTest() {

    override val solution = No0301RemoveInvalidParentheses.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            setOf("(())()", "()()()"),
            solution.removeInvalidParentheses(s = "()())()").toSet()
        )
        Assertions.assertEquals(
            setOf("(a())()", "(a)()()"),
            solution.removeInvalidParentheses(s = "(a)())()").toSet()
        )
        Assertions.assertEquals(
            setOf(""),
            solution.removeInvalidParentheses(s = ")(").toSet()
        )
        Assertions.assertEquals(
            setOf(""),
            solution.removeInvalidParentheses(s = "(").toSet()
        )
        Assertions.assertEquals(
            setOf(""),
            solution.removeInvalidParentheses(s = ")").toSet()
        )
        Assertions.assertEquals(
            setOf("n"),
            solution.removeInvalidParentheses(s = "n").toSet()
        )
        Assertions.assertEquals(
            setOf(""),
            solution.removeInvalidParentheses(s = "((").toSet()
        )
        Assertions.assertEquals(
            setOf("()"),
            solution.removeInvalidParentheses(s = "((()").toSet()
        )
    }
}
