package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0933NumberOfRecentCallsTest : AbstractSolutionTest() {

    override val solution = No0933NumberOfRecentCalls.RecentCounter::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0933NumberOfRecentCalls.RecentCounter()
            Assertions.assertEquals(
                1,
                instance.ping(t = 1)
            )
            Assertions.assertEquals(
                2,
                instance.ping(t = 100)
            )
            Assertions.assertEquals(
                3,
                instance.ping(t = 3001)
            )
            Assertions.assertEquals(
                3,
                instance.ping(t = 3002)
            )
        }
    }
}