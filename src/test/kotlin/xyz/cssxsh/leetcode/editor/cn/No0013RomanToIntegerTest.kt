package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0013RomanToIntegerTest : AbstractSolutionTest() {

    override val solution = No0013RomanToInteger.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.romanToInt(s = "III")
        )
        Assertions.assertEquals(
            4,
            solution.romanToInt(s = "IV")
        )
        Assertions.assertEquals(
            9,
            solution.romanToInt(s = "IX")
        )
        Assertions.assertEquals(
            58,
            solution.romanToInt(s = "LVIII")
        )
        Assertions.assertEquals(
            1994,
            solution.romanToInt(s = "MCMXCIV")
        )
    }
}