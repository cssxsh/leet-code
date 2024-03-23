package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0142LinkedListCycleIiTest : AbstractSolutionTest() {

    override val solution = No0142LinkedListCycleIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(2, 0, -4).cycle(pos = 0),
            solution.detectCycle(head = listNodeOf(3, 2, 0, -4).cycle(pos = 1))
        )
        Assertions.assertEquals(
            listNodeOf(2, 0, -4).cycle(pos = 0),
            solution.detectCycle(head = listNodeOf(8, 7, 6, 5, 3, 2, 0, -4).cycle(pos = 5))
        )
        Assertions.assertEquals(
            listNodeOf(1, 2).cycle(pos = 0),
            solution.detectCycle(head = listNodeOf(1, 2).cycle(pos = 0))
        )
        Assertions.assertEquals(
            listNodeOf(1).cycle(pos = 0),
            solution.detectCycle(head = listNodeOf(1).cycle(pos = 0))
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.detectCycle(head = listNodeOf(1).cycle(pos = -1))
        )
    }
}