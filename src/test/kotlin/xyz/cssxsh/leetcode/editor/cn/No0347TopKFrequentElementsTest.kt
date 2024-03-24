package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0347TopKFrequentElementsTest : AbstractSolutionTest() {

    override val solution = No0347TopKFrequentElements.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 2),
            solution.topKFrequent(nums = intArrayOf(1, 1, 1, 2, 2, 3), k = 2)
        )
        Assertions.assertArrayEquals(
            intArrayOf(1),
            solution.topKFrequent(nums = intArrayOf(1), k = 1)
        )
    }
}