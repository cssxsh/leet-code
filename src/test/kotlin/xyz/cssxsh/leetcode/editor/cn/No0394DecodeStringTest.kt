package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0394DecodeStringTest : AbstractSolutionTest() {

    override val solution = No0394DecodeString.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "aaabcbc",
            solution.decodeString(s = "3[a]2[bc]")
        )
        Assertions.assertEquals(
            "accaccacc",
            solution.decodeString(s = "3[a2[c]]")
        )
        Assertions.assertEquals(
            "abcabccdcdcdef",
            solution.decodeString(s = "2[abc]3[cd]ef")
        )
        Assertions.assertEquals(
            "abccdcdcdxyz",
            solution.decodeString(s = "abc3[cd]xyz")
        )
    }
}