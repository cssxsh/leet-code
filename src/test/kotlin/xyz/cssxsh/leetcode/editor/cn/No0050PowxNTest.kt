package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import kotlin.math.*

internal class No0050PowxNTest : AbstractSolutionTest() {

    override val solution = No0050PowxN.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1024.00000,
            solution.myPow(x = 2.00000, n = 10)
        )
        Assertions.assertEquals(
            9.26100,
            solution.myPow(x = 2.10000, n = 3).truncate()
        )
        Assertions.assertEquals(
            0.25000,
            solution.myPow(x = 2.00000, n = -2)
        )
        Assertions.assertEquals(
            0.00000,
            solution.myPow(x = 0.00000, n = 1)
        )
        Assertions.assertEquals(
            1.00000,
            solution.myPow(x = 1.00000, n = Int.MIN_VALUE)
        )
        Assertions.assertEquals(
            0.00000,
            solution.myPow(x = 0.00001, n = Int.MAX_VALUE)
        )
    }

    private fun Double.truncate(): Double = round(x = this * 10_0000) / 10_0000
}