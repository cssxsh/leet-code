package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0658FindKClosestElementsTest : AbstractSolutionTest() {

    override val solution = No0658FindKClosestElements.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(1, 2, 3, 4),
            solution.findClosestElements(arr = intArrayOf(1, 2, 3, 4, 5), k = 4, x = 3)
        )
        Assertions.assertEquals(
            listOf(1, 2, 3, 4),
            solution.findClosestElements(arr = intArrayOf(1, 2, 3, 4, 5), k = 4, x = -1)
        )
        Assertions.assertEquals(
            listOf(1),
            solution.findClosestElements(arr = intArrayOf(1), k = 1, x = 1)
        )
        Assertions.assertEquals(
            listOf(1),
            solution.findClosestElements(arr = intArrayOf(1, 2), k = 1, x = 1)
        )
        Assertions.assertEquals(
            listOf(10),
            solution.findClosestElements(arr = intArrayOf(1, 1, 1, 10, 10, 10), k = 1, x = 9)
        )
        Assertions.assertEquals(
            listOf(3, 3, 4),
            solution.findClosestElements(arr = intArrayOf(0, 0, 1, 2, 3, 3, 4, 7, 7, 8), k = 3, x = 5)
        )
        Assertions.assertEquals(
            listOf(5, 5, 6, 6, 7, 7, 8),
            solution.findClosestElements(arr = intArrayOf(1, 2, 5, 5, 6, 6, 7, 7, 8, 9), k = 7, x = 7)
        )
    }
}