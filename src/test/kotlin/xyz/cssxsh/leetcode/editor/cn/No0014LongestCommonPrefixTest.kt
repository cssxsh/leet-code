package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0014LongestCommonPrefixTest : AbstractSolutionTest() {

    override val solution = No0014LongestCommonPrefix.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "fl",
            solution.longestCommonPrefix(
                strs = arrayOf(
                    "flower",
                    "flow",
                    "flight"
                )
            )
        )
        Assertions.assertEquals(
            "",
            solution.longestCommonPrefix(
                strs = arrayOf(
                    "dog",
                    "racecar",
                    "car"
                )
            )
        )
    }
}