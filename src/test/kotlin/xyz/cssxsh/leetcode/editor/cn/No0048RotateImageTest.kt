package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0048RotateImageTest : AbstractSolutionTest() {

    override val solution = No0048RotateImage.Solution()

    @Test
    override fun example() {
//        Assertions.assertArrayEquals(
//            arrayOf(
//                intArrayOf(7, 4, 1),
//                intArrayOf(8, 5, 2),
//                intArrayOf(9, 6, 3),
//            ),
//            arrayOf(
//                intArrayOf(1, 2, 3),
//                intArrayOf(4, 5, 6),
//                intArrayOf(7, 8, 9),
//            ).also { solution.rotate(matrix = it) }
//        )
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(15, 13, 2, 5),
                intArrayOf(14, 3, 4, 1),
                intArrayOf(12, 6, 8, 9),
                intArrayOf(16, 7, 10, 11),
            ),
            arrayOf(
                intArrayOf(5, 1, 9, 11),
                intArrayOf(2, 4, 8, 10),
                intArrayOf(13, 3, 6, 7),
                intArrayOf(15, 14, 12, 16),
            ).also { solution.rotate(matrix = it) }
        )
    }
}