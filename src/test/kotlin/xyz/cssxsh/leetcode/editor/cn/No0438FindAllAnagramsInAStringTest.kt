package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0438FindAllAnagramsInAStringTest : AbstractSolutionTest() {

    override val solution = No0438FindAllAnagramsInAString.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(0, 6),
            solution.findAnagrams(s = "cbaebabacd", p = "abc")
        )
        Assertions.assertEquals(
            listOf(0, 1, 2),
            solution.findAnagrams(s = "abab", p = "ab")
        )
    }
}