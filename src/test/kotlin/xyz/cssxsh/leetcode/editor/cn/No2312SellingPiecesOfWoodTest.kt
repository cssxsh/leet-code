package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2312SellingPiecesOfWoodTest : AbstractSolutionTest() {

    override val solution = No2312SellingPiecesOfWood.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            19,
            solution.sellingWood(
                m = 3,
                n = 5,
                prices = arrayOf(intArrayOf(1, 4, 2), intArrayOf(2, 2, 7), intArrayOf(2, 1, 3))
            )
        )
        Assertions.assertEquals(
            32,
            solution.sellingWood(
                m = 4,
                n = 6,
                prices = arrayOf(intArrayOf(3,2,10), intArrayOf(1,4,2), intArrayOf(4,1,3))
            )
        )
    }
}