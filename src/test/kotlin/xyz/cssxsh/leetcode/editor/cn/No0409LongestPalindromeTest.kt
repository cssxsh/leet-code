package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0409LongestPalindromeTest : AbstractSolutionTest() {

    override val solution = No0409LongestPalindrome.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            7,
            solution.longestPalindrome(s = "abccccdd")
        )
        Assertions.assertEquals(
            1,
            solution.longestPalindrome(s = "a")
        )
        Assertions.assertEquals(
            7,
            solution.longestPalindrome(s = "aaaaaccc")
        )
    }
}