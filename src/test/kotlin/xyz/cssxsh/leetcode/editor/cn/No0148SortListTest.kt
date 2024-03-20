package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0148SortListTest : AbstractSolutionTest() {

    override val solution = No0148SortList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 2, 3, 4),
            solution.sortList(head = listNodeOf(4, 2, 1, 3))
        )
        Assertions.assertEquals(
            listNodeOf(-1, 0, 3, 4, 5),
            solution.sortList(head = listNodeOf(-1, 5, 3, 4, 0))
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.sortList(head = null as ListNode?)
        )
    }
}