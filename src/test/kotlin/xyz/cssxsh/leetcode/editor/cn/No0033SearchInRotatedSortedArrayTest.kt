package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0033SearchInRotatedSortedArrayTest : AbstractSolutionTest() {

    override val solution = No0033SearchInRotatedSortedArray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.search(
                nums = intArrayOf(4, 5, 6, 7, 0, 1, 2),
                target = 0
            )
        )
        Assertions.assertEquals(
            -1,
            solution.search(
                nums = intArrayOf(4, 5, 6, 7, 0, 1, 2),
                target = 3
            )
        )
        val k = (0 .. 9).random()
        val nums = IntArray(size = 10) { (it + 10 + k) % 10 }
        val t = (0 .. 9).random()
        println(nums.contentToString())
        Assertions.assertEquals(
            (t + 10 - k) % 10,
            solution.search(
                nums = nums,
                target = t
            )
        )
    }
}