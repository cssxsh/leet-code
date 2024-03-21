package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.listNodeOf

internal class No0160IntersectionOfTwoLinkedListsTest : AbstractSolutionTest() {

    override val solution = No0160IntersectionOfTwoLinkedLists.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(8, 4, 5),
            solution.getIntersectionNode(
                intersectVal = 8,
                listA = listNodeOf(4, 1, 8, 4, 5),
                listB = listNodeOf(5, 6, 1, 8, 4, 5),
                skipA = 2,
                skipB = 3
            )
        )
        Assertions.assertEquals(
            listNodeOf(2, 4),
            solution.getIntersectionNode(
                intersectVal = 2,
                listA = listNodeOf(1, 9, 1, 2, 4),
                listB = listNodeOf(3, 2, 4),
                skipA = 3,
                skipB = 1
            )
        )
    }
}