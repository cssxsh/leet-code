package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0023MergeKSortedListsTest : AbstractSolutionTest() {

    override val solution = No0023MergeKSortedLists.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 1, 2, 3, 4, 4, 5, 6),
            solution.mergeKLists(
                lists = arrayOf(
                    listNodeOf(1, 4, 5),
                    listNodeOf(1, 3, 4),
                    listNodeOf(2, 6)
                )
            )
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.mergeKLists(
                lists = arrayOf()
            )
        )
        Assertions.assertEquals(
            null as ListNode?,
            solution.mergeKLists(
                lists = arrayOf(null)
            )
        )
    }
}