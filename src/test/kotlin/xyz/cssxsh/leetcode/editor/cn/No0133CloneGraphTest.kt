package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0133CloneGraphTest : AbstractSolutionTest() {

    override val solution = No0133CloneGraph.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            graphNodeOf(
                listOf(2, 4),
                listOf(1, 3),
                listOf(2, 4),
                listOf(1, 3)
            ),
            solution.cloneGraph(
                node = graphNodeOf(
                    listOf(2, 4),
                    listOf(1, 3),
                    listOf(2, 4),
                    listOf(1, 3)
                )
            )
        )
        Assertions.assertEquals(
            graphNodeOf(
                emptyList()
            ),
            solution.cloneGraph(
                node = graphNodeOf(
                    emptyList()
                )
            )
        )
        Assertions.assertEquals(
            graphNodeOf(),
            solution.cloneGraph(
                node = graphNodeOf()
            )
        )
        Assertions.assertEquals(
            graphNodeOf(
                listOf(2),
                listOf(1)
            ),
            solution.cloneGraph(
                node = graphNodeOf(
                    listOf(2),
                    listOf(1)
                )
            )
        )
    }
}