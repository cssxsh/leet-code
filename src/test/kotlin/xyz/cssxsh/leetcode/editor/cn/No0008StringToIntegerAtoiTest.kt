package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0008StringToIntegerAtoiTest : AbstractSolutionTest() {

    override val solution = No0008StringToIntegerAtoi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            42,
            solution.myAtoi(s = "42")
        )
        Assertions.assertEquals(
            -42,
            solution.myAtoi(s = "   -42")
        )
        Assertions.assertEquals(
            4193,
            solution.myAtoi(s = "4193 with words")
        )
        Assertions.assertEquals(
            Int.MIN_VALUE,
            solution.myAtoi(s = "-2147483648")
        )
        Assertions.assertEquals(
            Int.MIN_VALUE,
            solution.myAtoi(s = "-2147483649")
        )
        Assertions.assertEquals(
            Int.MAX_VALUE,
            solution.myAtoi(s = "2147483647")
        )
        Assertions.assertEquals(
            Int.MAX_VALUE,
            solution.myAtoi(s = "2147483648")
        )
        Assertions.assertEquals(
            0,
            solution.myAtoi(s = "--1")
        )
        Assertions.assertEquals(
            0,
            solution.myAtoi(s = "++1")
        )
    }
}