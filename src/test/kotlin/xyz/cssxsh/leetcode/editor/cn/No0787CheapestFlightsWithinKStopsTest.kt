package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0787CheapestFlightsWithinKStopsTest : AbstractSolutionTest() {

    override val solution = No0787CheapestFlightsWithinKStops.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            200,
            solution.findCheapestPrice(
                n = 3,
                flights = arrayOf(
                    intArrayOf(0, 1, 100),
                    intArrayOf(1, 2, 100),
                    intArrayOf(0, 2, 500)
                ),
                src = 0,
                dst = 2,
                k = 1
            )
        )
        Assertions.assertEquals(
            500,
            solution.findCheapestPrice(
                n = 3,
                flights = arrayOf(
                    intArrayOf(0, 1, 100),
                    intArrayOf(1, 2, 100),
                    intArrayOf(0, 2, 500)
                ),
                src = 0,
                dst = 2,
                k = 0
            )
        )
    }
}