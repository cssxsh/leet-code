package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0160IntersectionOfTwoLinkedListsTest : AbstractSolutionTest() {

    override val solution = No0160IntersectionOfTwoLinkedLists.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(8, 4, 5),
            (listNodeOf(4, 1, 8, 4, 5) to listNodeOf(5, 6, 1, 8, 4, 5))
                .intersection(2 to 3)
                .let { (a, b) -> solution.getIntersectionNode(headA = a, headB = b) }
        )
        Assertions.assertEquals(
            listNodeOf(2, 4),
            (listNodeOf(1, 9, 1, 2, 4) to listNodeOf(3, 2, 4))
                .intersection(3 to 1)
                .let { (a, b) -> solution.getIntersectionNode(headA = a, headB = b) }
        )
        Assertions.assertEquals(
            null as ListNode?,
            (listNodeOf(2, 6, 4) to listNodeOf(1, 5))
                .intersection(3 to 2)
                .let { (a, b) -> solution.getIntersectionNode(headA = a, headB = b) }
        )
    }
}