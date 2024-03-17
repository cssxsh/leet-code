package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0017LetterCombinationsOfAPhoneNumberTest : AbstractSolutionTest() {

    override val solution = No0017LetterCombinationsOfAPhoneNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            solution.letterCombinations(digits = "23")
        )
        Assertions.assertEquals(
            emptyList<String>(),
            solution.letterCombinations(digits = "")
        )
    }
}