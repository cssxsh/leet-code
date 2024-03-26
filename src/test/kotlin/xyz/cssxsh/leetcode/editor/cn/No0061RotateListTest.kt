package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0061RotateListTest : AbstractSolutionTest() {

    override val solution = No0061RotateList.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listNodeOf(4, 5, 1, 2, 3),
            solution.rotateRight(head = listNodeOf(1, 2, 3, 4, 5), k = 2)
        )
        Assertions.assertEquals(
            listNodeOf(2, 0, 1),
            solution.rotateRight(head = listNodeOf(0, 1, 2), k = 4)
        )
    }
}