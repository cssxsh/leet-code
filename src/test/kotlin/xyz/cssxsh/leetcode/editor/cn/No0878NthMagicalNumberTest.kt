package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0878NthMagicalNumberTest : AbstractSolutionTest() {

    override val solution = No0878NthMagicalNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.nthMagicalNumber(n = 1, a = 2, b = 3)
        )
        Assertions.assertEquals(
            6,
            solution.nthMagicalNumber(n = 4, a = 2, b = 3)
        )
    }
}