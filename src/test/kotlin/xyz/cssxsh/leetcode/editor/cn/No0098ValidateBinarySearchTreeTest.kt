package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0098ValidateBinarySearchTreeTest : AbstractSolutionTest() {

    override val solution = No0098ValidateBinarySearchTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.isValidBST(root = treeNodeOf(2, 1, 3))
        )
        Assertions.assertEquals(
            false,
            solution.isValidBST(root = treeNodeOf(5, 1, 4, null, null, 3, 6))
        )
    }
}