package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0082RemoveDuplicatesFromSortedListIiTest : AbstractSolutionTest() {

    override val solution = No0082RemoveDuplicatesFromSortedListIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 2, 5),
            solution.deleteDuplicates(head = listNodeOf(1, 2, 3, 3, 4, 4, 5))
        )
        Assertions.assertEquals(
            listNodeOf(2, 3),
            solution.deleteDuplicates(head = listNodeOf(1, 1, 1, 2, 3))
        )
    }
}