package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0005LongestPalindromicSubstringTest : AbstractSolutionTest() {

    override val solution = No0005LongestPalindromicSubstring.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "aba",
            solution.longestPalindrome(s = "babad")
        )
        Assertions.assertEquals(
            "bb",
            solution.longestPalindrome(s = "cbbd")
        )
    }
}