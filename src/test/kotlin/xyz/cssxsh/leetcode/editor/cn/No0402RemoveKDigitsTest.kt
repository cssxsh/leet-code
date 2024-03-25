package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0402RemoveKDigitsTest : AbstractSolutionTest() {

    override val solution = No0402RemoveKDigits.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "1219",
            solution.removeKdigits(num = "1432219", k = 3)
        )
        Assertions.assertEquals(
            "200",
            solution.removeKdigits(num = "10200", k = 1)
        )
        Assertions.assertEquals(
            "0",
            solution.removeKdigits(num = "10", k = 2)
        )
        Assertions.assertEquals(
            "11",
            solution.removeKdigits(num = "112", k = 1)
        )
    }
}