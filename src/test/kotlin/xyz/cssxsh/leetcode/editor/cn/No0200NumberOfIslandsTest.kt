package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0200NumberOfIslandsTest : AbstractSolutionTest() {

    override val solution = No0200NumberOfIslands.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.numIslands(
                grid = arrayOf(
                    charArrayOf('1', '1', '1', '1', '0'),
                    charArrayOf('1', '1', '0', '1', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '0', '0', '0')
                )
            )
        )
        Assertions.assertEquals(
            3,
            solution.numIslands(
                grid = arrayOf(
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('1', '1', '0', '0', '0'),
                    charArrayOf('0', '0', '1', '0', '0'),
                    charArrayOf('0', '0', '0', '1', '1')
                )
            )
        )
        Assertions.assertEquals(
            1,
            solution.numIslands(
                grid = arrayOf(
                    charArrayOf('1', '1', '1'),
                    charArrayOf('0', '1', '0'),
                    charArrayOf('1', '1', '1')
                )
            )
        )
    }
}