package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0373FindKPairsWithSmallestSumsTest : AbstractSolutionTest() {

    override val solution = No0373FindKPairsWithSmallestSums.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf(1, 2),
                listOf(1, 4),
                listOf(1, 6)
            ),
            solution.kSmallestPairs(
                nums1 = intArrayOf(1, 7, 11),
                nums2 = intArrayOf(2, 4, 6),
                k = 3
            )
        )
        Assertions.assertEquals(
            listOf(
                listOf(1, 1),
                listOf(1, 1)
            ),
            solution.kSmallestPairs(
                nums1 = intArrayOf(1, 1, 2),
                nums2 = intArrayOf(1, 2, 3),
                k = 2
            )
        )
    }
}