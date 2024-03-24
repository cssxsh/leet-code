package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1143LongestCommonSubsequenceTest : AbstractSolutionTest() {

    override val solution = No1143LongestCommonSubsequence.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.longestCommonSubsequence(
                text1 = "abcde",
                text2 = "ace"
            )
        )
        Assertions.assertEquals(
            3,
            solution.longestCommonSubsequence(
                text1 = "abc",
                text2 = "abc"
            )
        )
        Assertions.assertEquals(
            0,
            solution.longestCommonSubsequence(
                text1 = "abc",
                text2 = "def"
            )
        )
    }
}