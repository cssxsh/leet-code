package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0019RemoveNthNodeFromEndOfListTest : AbstractSolutionTest() {

    override val solution = No0019RemoveNthNodeFromEndOfList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 2, 3, 5),
            solution.removeNthFromEnd(head = listNodeOf(1, 2, 3, 4, 5), n = 2)
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.removeNthFromEnd(head = listNodeOf(1), n = 1)
        )
        Assertions.assertEquals(
            listNodeOf(1),
            solution.removeNthFromEnd(head = listNodeOf(1, 2), n = 1)
        )
    }
}