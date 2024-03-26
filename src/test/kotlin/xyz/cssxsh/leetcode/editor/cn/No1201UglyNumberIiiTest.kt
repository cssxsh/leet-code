package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1201UglyNumberIiiTest : AbstractSolutionTest() {

    override val solution = No1201UglyNumberIii.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.nthUglyNumber(n = 3, a = 2, b = 3, c = 5)
        )
        Assertions.assertEquals(
            6,
            solution.nthUglyNumber(n = 4, a = 2, b = 3, c = 4)
        )
        Assertions.assertEquals(
            10,
            solution.nthUglyNumber(n = 5, a = 2, b = 11, c = 13)
        )
        Assertions.assertEquals(
            1999999984,
            solution.nthUglyNumber(n = 1000000000, a = 2, b = 217983653, c = 336916467)
        )
    }
}