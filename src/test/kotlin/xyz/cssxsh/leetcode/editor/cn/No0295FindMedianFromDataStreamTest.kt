package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0295FindMedianFromDataStreamTest : AbstractSolutionTest() {

    override val solution = No0295FindMedianFromDataStream.MedianFinder()

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            solution.addNum(num = 1)
            solution.addNum(num = 2)
        }
        Assertions.assertEquals(
            1.5,
            solution.findMedian()
        )
        Assertions.assertDoesNotThrow {
            solution.addNum(num = 3)
        }
        Assertions.assertEquals(
            2.0,
            solution.findMedian()
        )
    }
}