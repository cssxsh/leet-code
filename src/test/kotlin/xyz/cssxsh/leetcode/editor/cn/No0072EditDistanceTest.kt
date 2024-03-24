package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0072EditDistanceTest : AbstractSolutionTest() {

    override val solution = No0072EditDistance.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.minDistance(
                word1 = "horse",
                word2 = "ros"
            )
        )
        Assertions.assertEquals(
            5,
            solution.minDistance(
                word1 = "intention",
                word2 = "execution"
            )
        )
    }
}