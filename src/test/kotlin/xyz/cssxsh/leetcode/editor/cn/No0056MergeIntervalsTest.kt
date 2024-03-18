package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0056MergeIntervalsTest : AbstractSolutionTest() {

    override val solution = No0056MergeIntervals.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(1, 6),
                intArrayOf(8, 10),
                intArrayOf(15, 18)
            ),
            solution.merge(
                intervals = arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 6),
                    intArrayOf(8, 10),
                    intArrayOf(15, 18)
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(1, 5),
            ),
            solution.merge(
                intervals = arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(4, 5),
                )
            )
        )
    }
}