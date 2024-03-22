package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0101SymmetricTreeTest : AbstractSolutionTest() {

    override val solution = No0101SymmetricTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isSymmetric(root = treeNodeOf(1, 2, 2, 3, 4, 4, 3))
        )
        Assertions.assertEquals(
            false,
            solution.isSymmetric(root = treeNodeOf(1, 2, 2, null, 3, null, 3))
        )
    }
}