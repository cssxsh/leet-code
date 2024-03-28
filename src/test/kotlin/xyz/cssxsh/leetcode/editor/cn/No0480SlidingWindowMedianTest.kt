package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0480SlidingWindowMedianTest : AbstractSolutionTest() {

    override val solution = No0480SlidingWindowMedian.Solution()

    @Test
    override fun example() {
        Assertions.assertArrayEquals(
            doubleArrayOf(1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000),
            solution.medianSlidingWindow(
                nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7),
                k = 3
            )
        )
        Assertions.assertArrayEquals(
            doubleArrayOf(2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000),
            solution.medianSlidingWindow(
                nums = intArrayOf(1, 2, 3, 4, 2, 3, 1, 4, 2),
                k = 3
            )
        )
        Assertions.assertArrayEquals(
            doubleArrayOf(2147483647.0),
            solution.medianSlidingWindow(
                nums = intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE),
                k = 2
            )
        )
        Assertions.assertArrayEquals(
            doubleArrayOf(1073741824.0, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 1073741827.0),
            solution.medianSlidingWindow(
                nums = intArrayOf(2147483647, 1, 2, 3, 4, 5, 6, 7, 2147483647),
                k = 2
            )
        )
        Assertions.assertArrayEquals(
            doubleArrayOf(
                -1073741823.5,
                -1073741823.5,
                -49.5,
                -49.5,
                2.0,
                5.5,
                -46.0,
                -46.0,
                12.5,
                19.5,
                1073741834.5,
                2147483647.0,
                2147483647.0,
                2147483647.0,
                2147483647.0
            ),
            solution.medianSlidingWindow(
                nums = intArrayOf(
                    -2147483648,
                    -2147483648,
                    2147483647,
                    -2147483648,
                    1,
                    3,
                    -2147483648,
                    -100,
                    8,
                    17,
                    22,
                    -2147483648,
                    -2147483648,
                    2147483647,
                    2147483647,
                    2147483647,
                    2147483647,
                    -2147483648,
                    2147483647,
                    -2147483648
                ),
                k = 6
            )
        )
    }
}