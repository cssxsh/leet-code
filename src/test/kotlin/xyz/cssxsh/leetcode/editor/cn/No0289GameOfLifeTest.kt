package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0289GameOfLifeTest : AbstractSolutionTest() {

    override val solution = No0289GameOfLife.Solution()

    @Test
    override fun example() {
//        Assertions.assertArrayEquals(
//            arrayOf(
//                intArrayOf(0, 0, 0),
//                intArrayOf(1, 0, 1),
//                intArrayOf(0, 1, 1),
//                intArrayOf(0, 1, 0)
//            ),
//            arrayOf(
//                intArrayOf(0, 1, 0),
//                intArrayOf(0, 0, 1),
//                intArrayOf(1, 1, 1),
//                intArrayOf(0, 0, 0)
//            ).also { solution.gameOfLife(board = it) }
//        )
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(1, 1)
            ),
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(1, 0)
            ).also { solution.gameOfLife(board = it) }
        )
    }
}