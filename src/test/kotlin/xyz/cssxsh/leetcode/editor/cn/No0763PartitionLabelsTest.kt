package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0763PartitionLabelsTest : AbstractSolutionTest() {

    override val solution = No0763PartitionLabels.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(9, 7, 8),
            solution.partitionLabels(s = "ababcbacadefegdehijhklij")
        )
        Assertions.assertEquals(
            listOf(10),
            solution.partitionLabels(s = "eccbbbbdec")
        )
    }
}