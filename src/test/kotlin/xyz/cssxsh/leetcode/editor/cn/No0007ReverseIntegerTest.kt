package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0007ReverseIntegerTest : AbstractSolutionTest() {

    override val solution = No0007ReverseInteger.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            321,
            solution.reverse(x = 123)
        )
        Assertions.assertEquals(
            -321,
            solution.reverse(x = -123)
        )
        Assertions.assertEquals(
            21,
            solution.reverse(x = 120)
        )
        Assertions.assertEquals(
            0,
            solution.reverse(x = 1563847412)
        )
        Assertions.assertEquals(
            0,
            solution.reverse(x = Int.MIN_VALUE)
        )
    }
}