package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0219ContainsDuplicateIiTest : AbstractSolutionTest() {

    override val solution = No0219ContainsDuplicateIi.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1), k = 3)
        )
        Assertions.assertEquals(
            true,
            solution.containsNearbyDuplicate(nums = intArrayOf(1, 0, 1, 1), k = 1)
        )
        Assertions.assertEquals(
            false,
            solution.containsNearbyDuplicate(nums = intArrayOf(1, 2, 3, 1, 2, 3), k = 2)
        )
    }
}