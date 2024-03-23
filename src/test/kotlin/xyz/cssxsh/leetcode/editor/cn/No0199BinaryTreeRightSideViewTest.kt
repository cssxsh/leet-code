package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0199BinaryTreeRightSideViewTest : AbstractSolutionTest() {

    override val solution = No0199BinaryTreeRightSideView.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1, 3, 4),
            solution.rightSideView(root = treeNodeOf(1, 2, 3, null, 5, null, 4))
        )
        Assertions.assertEquals(
            listOf(1, 3),
            solution.rightSideView(root = treeNodeOf(1, 3))
        )
        Assertions.assertEquals(
            emptyList<Int>(),
            solution.rightSideView(root = treeNodeOf())
        )
    }
}