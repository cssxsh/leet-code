package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0206ReverseLinkedListTest : AbstractSolutionTest() {

    override val solution = No0206ReverseLinkedList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1,2,3,4,5),
            solution.reverseList(head = listNodeOf(5,4,3,2,1))
        )
        Assertions.assertEquals(
            listNodeOf(1, 2),
            solution.reverseList(head = listNodeOf(2, 1))
        )
        Assertions.assertEquals(
            null,
            solution.reverseList(head = null)
        )
    }
}