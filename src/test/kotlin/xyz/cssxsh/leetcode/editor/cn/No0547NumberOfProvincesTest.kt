package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0547NumberOfProvincesTest : AbstractSolutionTest() {

    override val solution = No0547NumberOfProvinces.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            2,
            solution.findCircleNum(
                isConnected = arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            )
        )
        Assertions.assertEquals(
            3,
            solution.findCircleNum(
                isConnected = arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            )
        )
    }
}