package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1969MinimumNonZeroProductOfTheArrayElementsTest : AbstractSolutionTest() {

    override val solution = No1969MinimumNonZeroProductOfTheArrayElements.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.minNonZeroProduct(p = 1)
        )
        Assertions.assertEquals(
            6,
            solution.minNonZeroProduct(p = 2)
        )
        Assertions.assertEquals(
            1512,
            solution.minNonZeroProduct(p = 3)
        )
        Assertions.assertEquals(
            581202553,
            solution.minNonZeroProduct(p = 4)
        )
        Assertions.assertEquals(
            202795991,
            solution.minNonZeroProduct(p = 5)
        )
    }
}