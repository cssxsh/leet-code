package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0310MinimumHeightTreesTest : AbstractSolutionTest() {

    override val solution = No0310MinimumHeightTrees.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1),
            solution.findMinHeightTrees(
                n = 4,
                edges = arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3)
                )
            )
        )
        Assertions.assertEquals(
            listOf(3, 4),
            solution.findMinHeightTrees(
                n = 6,
                edges = arrayOf(
                    intArrayOf(3, 0),
                    intArrayOf(3, 1),
                    intArrayOf(3, 2),
                    intArrayOf(3, 4),
                    intArrayOf(5, 4)
                )
            )
        )
    }
}