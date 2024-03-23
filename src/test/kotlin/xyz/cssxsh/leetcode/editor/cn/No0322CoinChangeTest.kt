package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0322CoinChangeTest : AbstractSolutionTest() {

    override val solution = No0322CoinChange.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.coinChange(
                coins = intArrayOf(1, 2, 5),
                amount = 11
            )
        )
        Assertions.assertEquals(
            -1,
            solution.coinChange(
                coins = intArrayOf(2),
                amount = 3
            )
        )
        Assertions.assertEquals(
            0,
            solution.coinChange(
                coins = intArrayOf(1),
                amount = 0
            )
        )
        Assertions.assertEquals(
            31,
            solution.coinChange(
                coins = intArrayOf(227, 99, 328, 299, 42, 322),
                amount = 9847
            )
        )
        Assertions.assertEquals(
            22,
            solution.coinChange(
                coins = intArrayOf(139,442,147,461,244,225,28,378,371),
                amount = 9914
            )
        )
    }
}