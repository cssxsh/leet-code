package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0529MinesweeperTest : AbstractSolutionTest() {

    override val solution = No0529Minesweeper.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            arrayOf(
                charArrayOf('B', '1', 'E', '1', 'B'),
                charArrayOf('B', '1', 'M', '1', 'B'),
                charArrayOf('B', '1', '1', '1', 'B'),
                charArrayOf('B', 'B', 'B', 'B', 'B')
            ),
            solution.updateBoard(
                board = arrayOf(
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'M', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E'),
                    charArrayOf('E', 'E', 'E', 'E', 'E')
                ),
                click = intArrayOf(3, 0)
            )
        )
        Assertions.assertArrayEquals(
            arrayOf(
                charArrayOf('B', '1', 'E', '1', 'B'),
                charArrayOf('B', '1', 'X', '1', 'B'),
                charArrayOf('B', '1', '1', '1', 'B'),
                charArrayOf('B', 'B', 'B', 'B', 'B')
            ),
            solution.updateBoard(
                board = arrayOf(
                    charArrayOf('B', '1', 'E', '1', 'B'),
                    charArrayOf('B', '1', 'M', '1', 'B'),
                    charArrayOf('B', '1', '1', '1', 'B'),
                    charArrayOf('B', 'B', 'B', 'B', 'B')
                ),
                click = intArrayOf(1, 2)
            )
        )
    }
}