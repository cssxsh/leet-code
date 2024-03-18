package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0617MergeTwoBinaryTreesTest : AbstractSolutionTest() {

    override val solution = No0617MergeTwoBinaryTrees.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            treeNodeOf(3, 4, 5, 5, 4, null, 7),
            solution.mergeTrees(
                root1 = treeNodeOf(1, 3, 2, 5),
                root2 = treeNodeOf(2, 1, 3, null, 4, null, 7)
            )
        )
        Assertions.assertEquals(
            treeNodeOf(2, 2),
            solution.mergeTrees(
                root1 = treeNodeOf(1),
                root2 = treeNodeOf(1, 2)
            )
        )
    }
}