package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0518CoinChangeIiTest : AbstractSolutionTest() {

    override val solution = No0518CoinChangeIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.change(amount = 5, coins = intArrayOf(1, 2, 5))
        )
        Assertions.assertEquals(
            0,
            solution.change(amount = 3, coins = intArrayOf(2))
        )
        Assertions.assertEquals(
            1,
            solution.change(amount = 10, coins = intArrayOf(10))
        )
    }
}