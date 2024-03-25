package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1081SmallestSubsequenceOfDistinctCharactersTest : AbstractSolutionTest() {

    override val solution = No1081SmallestSubsequenceOfDistinctCharacters.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "abc",
            solution.smallestSubsequence(s = "bcabc")
        )
        Assertions.assertEquals(
            "acdb",
            solution.smallestSubsequence(s = "cbacdcbc")
        )
    }
}