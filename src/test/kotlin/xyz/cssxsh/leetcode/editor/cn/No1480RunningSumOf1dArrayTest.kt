package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1480RunningSumOf1dArrayTest : AbstractSolutionTest() {

    override val solution = No1480RunningSumOf1dArray.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 3, 6, 10),
            solution.runningSum(nums = intArrayOf(1, 2, 3, 4))
        )
        Assertions.assertArrayEquals(
            intArrayOf(1, 2, 3, 4, 5),
            solution.runningSum(nums = intArrayOf(1, 1, 1, 1, 1))
        )
        Assertions.assertArrayEquals(
            intArrayOf(3, 4, 6, 16, 17),
            solution.runningSum(nums = intArrayOf(3, 1, 2, 10, 1))
        )
    }
}