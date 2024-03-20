package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0084LargestRectangleInHistogramTest : AbstractSolutionTest() {

    override val solution = No0084LargestRectangleInHistogram.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            10,
            solution.largestRectangleArea(heights = intArrayOf(2, 1, 5, 6, 2, 3))
        )
        Assertions.assertEquals(
            4,
            solution.largestRectangleArea(heights = intArrayOf(2, 4))
        )
        for (p1 in readExample(classifier = solution::class)) {
            solution.largestRectangleArea(heights = p1.parts().map(String::toInt).toList().toIntArray())
        }
    }
}