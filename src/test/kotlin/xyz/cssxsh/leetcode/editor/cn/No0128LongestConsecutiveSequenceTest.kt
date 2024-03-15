package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0128LongestConsecutiveSequenceTest : AbstractSolutionTest() {

    override val solution = No0128LongestConsecutiveSequence.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            4,
            solution.longestConsecutive(nums = intArrayOf(100, 4, 200, 1, 3, 2))
        )
        Assertions.assertEquals(
            9,
            solution.longestConsecutive(nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1))
        )
    }
}