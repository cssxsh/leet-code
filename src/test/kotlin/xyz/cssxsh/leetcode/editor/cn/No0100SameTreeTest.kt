package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0100SameTreeTest : AbstractSolutionTest() {

    override val solution = No0100SameTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isSameTree(
                p = treeNodeOf(1, 2, 3),
                q = treeNodeOf(1, 2, 3)
            )
        )
        Assertions.assertEquals(
            false,
            solution.isSameTree(
                p = treeNodeOf(1, 2),
                q = treeNodeOf(1, null, 2)
            )
        )
        Assertions.assertEquals(
            false,
            solution.isSameTree(
                p = treeNodeOf(1, 2, 1),
                q = treeNodeOf(1, 1, 2)
            )
        )
    }
}