package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0121BestTimeToBuyAndSellStockTest : AbstractSolutionTest() {

    override val solution = No0121BestTimeToBuyAndSellStock.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            5,
            solution.maxProfit(prices = intArrayOf(7, 1, 5, 3, 6, 4))
        )
        Assertions.assertEquals(
            0,
            solution.maxProfit(prices = intArrayOf(7, 6, 4, 3, 1))
        )
    }
}