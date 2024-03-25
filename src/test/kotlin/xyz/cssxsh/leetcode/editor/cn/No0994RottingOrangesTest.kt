package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0994RottingOrangesTest : AbstractSolutionTest() {

    override val solution = No0994RottingOranges.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.orangesRotting(
                grid = arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 1)
                )
            )
        )
        Assertions.assertEquals(
            -1,
            solution.orangesRotting(
                grid = arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        Assertions.assertEquals(
            0,
            solution.orangesRotting(
                grid = arrayOf(
                    intArrayOf(0, 2)
                )
            )
        )
    }
}