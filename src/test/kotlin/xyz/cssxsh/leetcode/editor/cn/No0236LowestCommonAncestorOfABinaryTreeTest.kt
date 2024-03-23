package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0236LowestCommonAncestorOfABinaryTreeTest : AbstractSolutionTest() {

    override val solution = No0236LowestCommonAncestorOfABinaryTree.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(3, 5, 2, 4),
            treeNodeOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)!!
                .let { solution.ancestor(root = it, nodes = arrayOf(it.find(value = 4)!!)) }[0]
                .map { it.`val` }
        )
        Assertions.assertEquals(
            treeNodeOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4),
            treeNodeOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)!!.let {
                solution.lowestCommonAncestor(
                    root = it,
                    p = it.find(value = 5)!!,
                    q = it.find(value = 1)!!
                )
            }
        )
        Assertions.assertEquals(
            treeNodeOf(5, 6, 2, null, null, 7, 4),
            treeNodeOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)!!.let {
                solution.lowestCommonAncestor(
                    root = it,
                    p = it.find(value = 5)!!,
                    q = it.find(value = 4)!!
                )
            }
        )
        Assertions.assertEquals(
            treeNodeOf(1, 2),
            treeNodeOf(1, 2)!!.let {
                solution.lowestCommonAncestor(
                    root = it,
                    p = it.find(value = 1)!!,
                    q = it.find(value = 2)!!
                )
            }
        )
    }
}