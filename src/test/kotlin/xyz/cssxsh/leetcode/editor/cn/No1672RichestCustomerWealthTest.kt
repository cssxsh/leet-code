package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1672RichestCustomerWealthTest : AbstractSolutionTest() {

    override val solution = No1672RichestCustomerWealth.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            6,
            solution.maximumWealth(accounts = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)))
        )
        Assertions.assertEquals(
            10,
            solution.maximumWealth(accounts = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)))
        )
        Assertions.assertEquals(
            17,
            solution.maximumWealth(accounts = arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5)))
        )
    }
}