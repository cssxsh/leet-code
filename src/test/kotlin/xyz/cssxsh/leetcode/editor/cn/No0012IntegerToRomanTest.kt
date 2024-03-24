package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0012IntegerToRomanTest : AbstractSolutionTest() {

    override val solution = No0012IntegerToRoman.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "III",
            solution.intToRoman(num = 3)
        )
        Assertions.assertEquals(
            "IV",
            solution.intToRoman(num = 4)
        )
        Assertions.assertEquals(
            "IX",
            solution.intToRoman(num = 9)
        )
        Assertions.assertEquals(
            "LVIII",
            solution.intToRoman(num = 58)
        )
        Assertions.assertEquals(
            "MCMXCIV",
            solution.intToRoman(num = 1994)
        )
    }
}