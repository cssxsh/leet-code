package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0316RemoveDuplicateLettersTest : AbstractSolutionTest() {

    override val solution = No0316RemoveDuplicateLetters.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "abc",
            solution.removeDuplicateLetters(s = "bcabc")
        )
        Assertions.assertEquals(
            "acdb",
            solution.removeDuplicateLetters(s = "cbacdcbc")
        )
    }
}