package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0448FindAllNumbersDisappearedInAnArrayTest : AbstractSolutionTest() {

    override val solution = No0448FindAllNumbersDisappearedInAnArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(5, 6),
            solution.findDisappearedNumbers(nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        )
        Assertions.assertEquals(
            listOf(2),
            solution.findDisappearedNumbers(nums = intArrayOf(1, 1))
        )
    }
}