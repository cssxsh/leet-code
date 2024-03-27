package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0785IsGraphBipartiteTest : AbstractSolutionTest() {

    override val solution = No0785IsGraphBipartite.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            false,
            solution.isBipartite(
                graph = arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(0, 2),
                    intArrayOf(0, 1, 3),
                    intArrayOf(0, 2)
                )
            )
        )
        Assertions.assertEquals(
            true,
            solution.isBipartite(
                graph = arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(0, 2),
                    intArrayOf(1, 3),
                    intArrayOf(0, 2)
                )
            )
        )
    }
}