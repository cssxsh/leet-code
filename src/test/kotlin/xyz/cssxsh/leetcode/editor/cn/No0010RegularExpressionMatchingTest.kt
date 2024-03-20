package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0010RegularExpressionMatchingTest : AbstractSolutionTest() {

    override val solution = No0010RegularExpressionMatching.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            false,
            solution.isMatch(s = "aa", p = "a")
        )
        Assertions.assertEquals(
            true,
            solution.isMatch(s = "aa", p = "a*")
        )
        Assertions.assertEquals(
            true,
            solution.isMatch(s = "ab", p = ".*")
        )
    }
}