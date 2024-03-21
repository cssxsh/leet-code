package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0234PalindromeLinkedListTest : AbstractSolutionTest() {

    override val solution = No0234PalindromeLinkedList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isPalindrome(head = listNodeOf(1, 2, 2, 1))
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(head = listNodeOf(1, 2, 3, 2, 1))
        )
        Assertions.assertEquals(
            false,
            solution.isPalindrome(head = listNodeOf(1, 2))
        )
        Assertions.assertEquals(
            true,
            solution.isPalindrome(head = listNodeOf(2))
        )
    }
}