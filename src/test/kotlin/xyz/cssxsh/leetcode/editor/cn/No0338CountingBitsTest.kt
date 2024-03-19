package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0338CountingBitsTest : AbstractSolutionTest() {

    override val solution = No0338CountingBits.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(0, 1, 1),
            solution.countBits(n = 2)
        )
        Assertions.assertArrayEquals(
            intArrayOf(0, 1, 1, 2, 1, 2),
            solution.countBits(n = 5)
        )
    }
}