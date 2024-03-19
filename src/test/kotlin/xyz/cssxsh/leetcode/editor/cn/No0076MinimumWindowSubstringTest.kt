package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0076MinimumWindowSubstringTest : AbstractSolutionTest() {

    override val solution = No0076MinimumWindowSubstring.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "BANC",
            solution.minWindow(s = "ADOBECODEBANC", t = "ABC")
        )
        Assertions.assertEquals(
            "a",
            solution.minWindow(s = "a", t = "a")
        )
        Assertions.assertEquals(
            "",
            solution.minWindow(s = "a", t = "aa")
        )
        Assertions.assertEquals(
            "b",
            solution.minWindow(s = "ab", t = "b")
        )
        Assertions.assertEquals(
            "cwae",
            solution.minWindow(s = "cabwefgewcwaefgcf", t = "cae")
        )
        Assertions.assertEquals(
            "abc",
            solution.minWindow(s = "abc", t = "cba")
        )
    }
}