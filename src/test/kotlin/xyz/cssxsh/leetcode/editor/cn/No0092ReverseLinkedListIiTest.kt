package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0092ReverseLinkedListIiTest : AbstractSolutionTest() {

    override val solution = No0092ReverseLinkedListIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(1, 4, 3, 2, 5),
            solution.reverseBetween(
                head = listNodeOf(1, 2, 3, 4, 5),
                left = 2,
                right = 4
            )
        )
        Assertions.assertEquals(
            listNodeOf(5),
            solution.reverseBetween(
                head = listNodeOf(5),
                left = 1,
                right = 1
            )
        )
    }
}