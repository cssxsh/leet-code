package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0264UglyNumberIiTest : AbstractSolutionTest() {

    override val solution = No0264UglyNumberIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            12,
            solution.nthUglyNumber(n = 10)
        )
        Assertions.assertEquals(
            1,
            solution.nthUglyNumber(n = 1)
        )
        Assertions.assertEquals(
            15,
            solution.nthUglyNumber(n = 11)
        )
    }
}