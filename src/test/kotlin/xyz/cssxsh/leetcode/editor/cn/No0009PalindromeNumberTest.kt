package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0009PalindromeNumberTest : AbstractSolutionTest() {

    override val solution = No0009PalindromeNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isPalindrome(x = 121)
        )
        Assertions.assertEquals(
            false,
            solution.isPalindrome(x = -121)
        )
        Assertions.assertEquals(
            false,
            solution.isPalindrome(x = 10)
        )
    }
}