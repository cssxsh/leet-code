package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0002AddTwoNumbersTest : AbstractSolutionTest() {

    override val solution = No0002AddTwoNumbers.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(7, 0, 8),
            solution.addTwoNumbers(l1 = listNodeOf(2, 4, 3), l2 = listNodeOf(5, 6, 4))
        )
        Assertions.assertEquals(
            listNodeOf(0),
            solution.addTwoNumbers(l1 = listNodeOf(0), l2 = listNodeOf(0))
        )
        Assertions.assertEquals(
            listNodeOf(8, 9, 9, 9, 0, 0, 0, 1),
            solution.addTwoNumbers(l1 = listNodeOf(9, 9, 9, 9, 9, 9, 9), l2 = listNodeOf(9, 9, 9, 9))
        )
    }
}