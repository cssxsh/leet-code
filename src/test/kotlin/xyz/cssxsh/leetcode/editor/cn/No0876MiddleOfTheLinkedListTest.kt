package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0876MiddleOfTheLinkedListTest : AbstractSolutionTest() {

    override val solution = No0876MiddleOfTheLinkedList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(3, 4, 5),
            solution.middleNode(head = listNodeOf(1, 2, 3, 4, 5))
        )
        Assertions.assertEquals(
            listNodeOf(4, 5, 6),
            solution.middleNode(head = listNodeOf(1, 2, 3, 4, 5, 6))
        )
    }
}