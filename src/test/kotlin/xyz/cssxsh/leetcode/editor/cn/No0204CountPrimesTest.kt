package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0204CountPrimesTest : AbstractSolutionTest() {

    override val solution = No0204CountPrimes.Solution()

    override fun example() {
        Assertions.assertEquals(
            4,
            solution.countPrimes(n = 10)
        )
        Assertions.assertEquals(
            0,
            solution.countPrimes(n = 0)
        )
        Assertions.assertEquals(
            0,
            solution.countPrimes(n = 1)
        )
    }
}