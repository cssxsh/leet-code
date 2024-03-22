package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0025ReverseNodesInKGroupTest : AbstractSolutionTest() {

    override val solution = No0025ReverseNodesInKGroup.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(2, 1, 4, 3, 5),
            solution.reverseKGroup(head = listNodeOf(1, 2, 3, 4, 5), k = 2)
        )
        Assertions.assertEquals(
            listNodeOf(3, 2, 1, 4, 5),
            solution.reverseKGroup(head = listNodeOf(1, 2, 3, 4, 5), k = 3)
        )
        Assertions.assertEquals(
            listNodeOf(1, 2, 3),
            solution.reverseKGroup(head = listNodeOf(1, 2, 3), k = 4)
        )
        Assertions.assertEquals(
            listNodeOf(1),
            solution.reverseKGroup(head = listNodeOf(1), k = 1)
        )
        Assertions.assertEquals(
            listNodeOf(2, 1),
            solution.reverseKGroup(head = listNodeOf(1, 2), k = 2)
        )
    }
}