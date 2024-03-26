package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0313SuperUglyNumberTest : AbstractSolutionTest() {

    override val solution = No0313SuperUglyNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            32,
            solution.nthSuperUglyNumber(n = 12, primes = intArrayOf(2, 7, 13, 19))
        )
        Assertions.assertEquals(
            1,
            solution.nthSuperUglyNumber(n = 1, primes = intArrayOf(2, 3, 5))
        )
    }
}