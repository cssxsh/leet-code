package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0024SwapNodesInPairsTest : AbstractSolutionTest() {

    override val solution = No0024SwapNodesInPairs.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(2, 1, 4, 3),
            solution.swapPairs(head = listNodeOf(1, 2, 3, 4))
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.swapPairs(head = null as ListNode?)
        )
        Assertions.assertEquals(
            listNodeOf(1),
            solution.swapPairs(head = listNodeOf(1))
        )
    }
}