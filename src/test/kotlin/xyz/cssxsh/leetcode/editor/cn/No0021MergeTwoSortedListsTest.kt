package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0021MergeTwoSortedListsTest : AbstractSolutionTest() {

    override val solution = No0021MergeTwoSortedLists.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 1, 2, 3, 4, 4),
            solution.mergeTwoLists(list1 = listNodeOf(1, 2, 4), list2 = listNodeOf(1, 3, 4))
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.mergeTwoLists(list1 = null as ListNode?, list2 = null as ListNode?)
        )
        Assertions.assertEquals(
            listNodeOf(0),
            solution.mergeTwoLists(list1 = null as ListNode?, list2 = listNodeOf(0))
        )
    }
}