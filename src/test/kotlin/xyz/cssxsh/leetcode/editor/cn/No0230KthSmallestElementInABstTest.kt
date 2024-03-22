package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0230KthSmallestElementInABstTest : AbstractSolutionTest() {

    override val solution = No0230KthSmallestElementInABst.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.kthSmallest(
                root = treeNodeOf(3, 1, 4, null, 2),
                k = 1
            )
        )
        Assertions.assertEquals(
            3,
            solution.kthSmallest(
                root = treeNodeOf(5, 3, 6, 2, 4, null, null, 1),
                k = 3
            )
        )
    }
}