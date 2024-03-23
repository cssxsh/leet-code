package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0139WordBreakTest : AbstractSolutionTest() {

    override val solution = No0139WordBreak.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.wordBreak(
                s = "leetcode",
                wordDict = listOf("leet", "code")
            )
        )
        Assertions.assertEquals(
            true,
            solution.wordBreak(
                s = "applepenapple",
                wordDict = listOf("apple", "pen")
            )
        )
        Assertions.assertEquals(
            false,
            solution.wordBreak(
                s = "catsandog",
                wordDict = listOf("cats", "dog", "sand", "and", "cat")
            )
        )
    }
}