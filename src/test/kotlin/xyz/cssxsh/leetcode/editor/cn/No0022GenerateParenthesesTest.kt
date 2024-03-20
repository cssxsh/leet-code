package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0022GenerateParenthesesTest : AbstractSolutionTest() {

    override val solution = No0022GenerateParentheses.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf("((()))", "(()())", "(())()", "()(())", "()()()"),
            solution.generateParenthesis(n = 3)
        )
        Assertions.assertEquals(
            listOf("()"),
            solution.generateParenthesis(n = 1)
        )
    }
}