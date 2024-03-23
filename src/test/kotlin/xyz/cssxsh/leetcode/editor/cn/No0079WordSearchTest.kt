package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0079WordSearchTest : AbstractSolutionTest() {

    override val solution = No0079WordSearch.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                word = "ABCCED"
            )
        )
        Assertions.assertEquals(
            true,
            solution.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                word = "SEE"
            )
        )
        Assertions.assertEquals(
            true,
            solution.exist(
                board = arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                word = "ABCB"
            )
        )
    }
}