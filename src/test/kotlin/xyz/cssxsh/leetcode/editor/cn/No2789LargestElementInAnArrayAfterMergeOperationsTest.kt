package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2789LargestElementInAnArrayAfterMergeOperationsTest : AbstractSolutionTest() {

    override val solution = No2789LargestElementInAnArrayAfterMergeOperations.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            21,
            solution.maxArrayValue(nums = intArrayOf(2, 3, 7, 9, 3))
        )
        Assertions.assertEquals(
            11,
            solution.maxArrayValue(nums = intArrayOf(5, 3, 3))
        )
    }
}