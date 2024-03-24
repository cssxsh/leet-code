package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0062UniquePathsTest : AbstractSolutionTest() {

    override val solution = No0062UniquePaths.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            28,
            solution.uniquePaths(m = 3, n = 7)
        )
        Assertions.assertEquals(
            3,
            solution.uniquePaths(m = 3, n = 2)
        )
        Assertions.assertEquals(
            28,
            solution.uniquePaths(m = 7, n = 3)
        )
        Assertions.assertEquals(
            6,
            solution.uniquePaths(m = 3, n = 3)
        )
    }
}