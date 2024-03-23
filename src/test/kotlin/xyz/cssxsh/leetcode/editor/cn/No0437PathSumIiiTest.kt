package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0437PathSumIiiTest : AbstractSolutionTest() {

    override val solution = No0437PathSumIii.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.pathSum(
                root = treeNodeOf(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1),
                targetSum = 8
            )
        )
        Assertions.assertEquals(
            3,
            solution.pathSum(
                root = treeNodeOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1),
                targetSum = 22
            )
        )
        Assertions.assertEquals(
            0,
            solution.pathSum(
                root = treeNodeOf(
                    1000000000,
                    1000000000, null,
                    294967296, null, 1000000000, null,
                    1000000000, null, 1000000000
                ),
                targetSum = 0
            )
        )
    }
}