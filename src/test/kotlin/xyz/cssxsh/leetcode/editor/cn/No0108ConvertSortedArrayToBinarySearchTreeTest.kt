package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0108ConvertSortedArrayToBinarySearchTreeTest : AbstractSolutionTest() {

    override val solution = No0108ConvertSortedArrayToBinarySearchTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(0, -3, 9, -10, null, 5),
            solution.sortedArrayToBST(nums = intArrayOf(-10, -3, 0, 5, 9))
        )
        Assertions.assertEquals(
            treeNodeOf(3, 1),
            solution.sortedArrayToBST(nums = intArrayOf(1, 3))
        )
    }
}