package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2642DesignGraphWithShortestPathCalculatorTest : AbstractSolutionTest() {

    override val solution = No2642DesignGraphWithShortestPathCalculator.Graph::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No2642DesignGraphWithShortestPathCalculator.Graph(
                n = 4,
                edges = arrayOf(
                    intArrayOf(0, 2, 5),
                    intArrayOf(0, 1, 2),
                    intArrayOf(1, 2, 1),
                    intArrayOf(3, 0, 3)
                )
            )
            Assertions.assertEquals(
                6,
                instance.shortestPath(node1 = 3, node2 = 2)
            )
            Assertions.assertEquals(
                -1,
                instance.shortestPath(node1 = 0, node2 = 3)
            )
            instance.addEdge(edge = intArrayOf(1, 3, 4))
            Assertions.assertEquals(
                6,
                instance.shortestPath(node1 = 0, node2 = 3)
            )
        }
        Assertions.assertDoesNotThrow {
            val instance = No2642DesignGraphWithShortestPathCalculator.Graph(
                n = 13,
                edges = arrayOf(
                    intArrayOf(7, 2, 131570),
                    intArrayOf(9, 4, 622890),
                    intArrayOf(9, 1, 812365),
                    intArrayOf(1, 3, 399349),
                    intArrayOf(10, 2, 407736),
                    intArrayOf(6, 7, 880509),
                    intArrayOf(1, 4, 289656),
                    intArrayOf(8, 0, 802664),
                    intArrayOf(6, 4, 826732),
                    intArrayOf(10, 3, 567982),
                    intArrayOf(5, 6, 434340),
                    intArrayOf(4, 7, 833968),
                    intArrayOf(12, 1, 578047),
                    intArrayOf(8, 5, 739814),
                    intArrayOf(10, 9, 648073),
                    intArrayOf(1, 6, 679167),
                    intArrayOf(3, 6, 933017),
                    intArrayOf(0, 10, 399226),
                    intArrayOf(1, 11, 915959),
                    intArrayOf(0, 12, 393037),
                    intArrayOf(11, 5, 811057),
                    intArrayOf(6, 2, 100832),
                    intArrayOf(5, 1, 731872),
                    intArrayOf(3, 8, 741455),
                    intArrayOf(2, 9, 835397),
                    intArrayOf(7, 0, 516610),
                    intArrayOf(11, 8, 680504),
                    intArrayOf(3, 11, 455056),
                    intArrayOf(1, 0, 252721)
                )
            )
            Assertions.assertEquals(
                1211714,
                instance.shortestPath(node1 = 9, node2 = 3)
            )
            instance.addEdge(edge = intArrayOf(11, 1, 873094))
            Assertions.assertEquals(
                1943345,
                instance.shortestPath(node1 = 3, node2 = 10)
            )
            instance.addEdge(edge = intArrayOf(0, 9, 601498))
            instance.addEdge(edge = intArrayOf(12, 0, 824080))
            instance.addEdge(edge = intArrayOf(12, 4, 459292))
            instance.addEdge(edge = intArrayOf(6, 9, 7876))
            instance.addEdge(edge = intArrayOf(11, 7, 5479))
            instance.addEdge(edge = intArrayOf(11, 12, 802))
            Assertions.assertEquals(
                835397,
                instance.shortestPath(node1 = 2, node2 = 9)
            )
            Assertions.assertEquals(
                2326929,
                instance.shortestPath(node1 = 2, node2 = 6)
            )
            instance.addEdge(edge = intArrayOf(0, 11, 441770))
            Assertions.assertEquals(
                460535,
                instance.shortestPath(node1 = 3, node2 = 7)
            )
            instance.addEdge(edge = intArrayOf(11, 0, 393443))
            Assertions.assertEquals(
                965538,
                instance.shortestPath(node1 = 4, node2 = 2)
            )
            instance.addEdge(edge = intArrayOf(10, 5, 338))
            instance.addEdge(edge = intArrayOf(6, 1, 305))
            instance.addEdge(edge = intArrayOf(5, 0, 154))
        }
    }
}