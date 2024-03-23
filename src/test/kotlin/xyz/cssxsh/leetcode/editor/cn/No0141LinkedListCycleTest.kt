package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0141LinkedListCycleTest : AbstractSolutionTest() {

    override val solution = No0141LinkedListCycle.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.hasCycle(head = listNodeOf(3, 2, 0, -1).cycle(pos = 1))
        )
        Assertions.assertEquals(
            true,
            solution.hasCycle(head = listNodeOf(1, 2).cycle(pos = 0))
        )
        Assertions.assertEquals(
            false,
            solution.hasCycle(head = listNodeOf(1).cycle(pos = -1))
        )
        Assertions.assertEquals(
            false,
            solution.hasCycle(head = null as ListNode?)
        )
    }
}