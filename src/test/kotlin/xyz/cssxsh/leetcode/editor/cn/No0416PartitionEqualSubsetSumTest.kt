package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0416PartitionEqualSubsetSumTest : AbstractSolutionTest() {

    override val solution = No0416PartitionEqualSubsetSum.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.canPartition(nums = intArrayOf(1, 5, 11, 5))
        )
        Assertions.assertEquals(
            false,
            solution.canPartition(nums = intArrayOf(1, 2, 3, 5))
        )
    }
}