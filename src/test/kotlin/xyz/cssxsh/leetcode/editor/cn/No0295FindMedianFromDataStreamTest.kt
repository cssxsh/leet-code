package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0295FindMedianFromDataStreamTest : AbstractSolutionTest() {

    override val solution = No0295FindMedianFromDataStream.MedianFinder::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0295FindMedianFromDataStream.MedianFinder()

            instance.addNum(num = 1)
            instance.addNum(num = 2)
            Assertions.assertEquals(
                1.5,
                instance.findMedian()
            )
            instance.addNum(num = 3)
            Assertions.assertEquals(
                2.0,
                instance.findMedian()
            )
        }
    }
}