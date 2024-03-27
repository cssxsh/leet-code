package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0406QueueReconstructionByHeightTest : AbstractSolutionTest() {

    override val solution = No0406QueueReconstructionByHeight.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(5, 0),
                intArrayOf(7, 0),
                intArrayOf(5, 2),
                intArrayOf(6, 1),
                intArrayOf(4, 4),
                intArrayOf(7, 1)
            ),
            solution.reconstructQueue(
                people = arrayOf(
                    intArrayOf(7, 0),
                    intArrayOf(4, 4),
                    intArrayOf(7, 1),
                    intArrayOf(5, 0),
                    intArrayOf(6, 1),
                    intArrayOf(5, 2)
                )
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(4, 0),
                intArrayOf(5, 0),
                intArrayOf(2, 2),
                intArrayOf(3, 2),
                intArrayOf(1, 4),
                intArrayOf(6, 0)
            ),
            solution.reconstructQueue(
                people = arrayOf(
                    intArrayOf(6, 0),
                    intArrayOf(5, 0),
                    intArrayOf(4, 0),
                    intArrayOf(3, 2),
                    intArrayOf(2, 2),
                    intArrayOf(1, 4)
                )
            )
        )
    }
}