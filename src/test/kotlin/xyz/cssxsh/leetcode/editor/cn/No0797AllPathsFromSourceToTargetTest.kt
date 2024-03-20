package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0797AllPathsFromSourceToTargetTest : AbstractSolutionTest() {

    override val solution = No0797AllPathsFromSourceToTarget.Solution()

    @Test
    override fun example() {
//        Assertions.assertEquals(
//            listOf(
//                listOf(0, 1, 3),
//                listOf(0, 2, 3)
//            ),
//            solution.allPathsSourceTarget(
//                graph = arrayOf(
//                    intArrayOf(1, 2),
//                    intArrayOf(3),
//                    intArrayOf(3),
//                    intArrayOf()
//                )
//            )
//        )
        Assertions.assertEquals(
            listOf(
                listOf(0, 4),
                listOf(0, 3, 4),
                listOf(0, 1, 3, 4),
                listOf(0, 1, 2, 3, 4),
                listOf(0, 1, 4)
            ),
            solution.allPathsSourceTarget(
                graph = arrayOf(
                    intArrayOf(4, 3, 1),
                    intArrayOf(3, 2, 4),
                    intArrayOf(3),
                    intArrayOf(4),
                    intArrayOf()
                )
            )
        )
    }
}