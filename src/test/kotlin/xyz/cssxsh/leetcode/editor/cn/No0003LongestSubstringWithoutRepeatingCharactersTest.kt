package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0003LongestSubstringWithoutRepeatingCharactersTest : AbstractSolutionTest() {

    override val solution = No0003LongestSubstringWithoutRepeatingCharacters.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.lengthOfLongestSubstring(s = "abcabcbb")
        )
        Assertions.assertEquals(
            1,
            solution.lengthOfLongestSubstring(s = "bbbbb")
        )
        Assertions.assertEquals(
            3,
            solution.lengthOfLongestSubstring(s = "pwwkew")
        )
    }
}