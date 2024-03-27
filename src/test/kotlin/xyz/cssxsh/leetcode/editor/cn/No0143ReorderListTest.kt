package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0143ReorderListTest : AbstractSolutionTest() {

    override val solution = No0143ReorderList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 4, 2, 3),
            listNodeOf(1, 2, 3, 4).also { solution.reorderList(head = it) }
        )
        Assertions.assertEquals(
            listNodeOf(1, 5, 2, 4, 3),
            listNodeOf(1, 2, 3, 4, 5).also { solution.reorderList(head = it) }
        )
    }
}