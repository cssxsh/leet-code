package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0125ValidPalindromeTest : AbstractSolutionTest() {

    override val solution = No0125ValidPalindrome.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isPalindrome(s = "A man, a plan, a canal: Panama")
        )
        Assertions.assertEquals(
            false,
            solution.isPalindrome(s = "race a car")
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(s = " ")
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(s = "   ")
        )
        Assertions.assertEquals(
            false,
            solution.isPalindrome(s = "0P")
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(s = "a.")
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(s = ".,")
        )
    }
}