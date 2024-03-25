package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0933NumberOfRecentCallsTest : AbstractSolutionTest() {

    override val solution = No0933NumberOfRecentCalls.RecentCounter()

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.ping(t = 1)
        )
        Assertions.assertEquals(
            2,
            solution.ping(t = 100)
        )
        Assertions.assertEquals(
            3,
            solution.ping(t = 3001)
        )
        Assertions.assertEquals(
            3,
            solution.ping(t = 3002)
        )
    }
}