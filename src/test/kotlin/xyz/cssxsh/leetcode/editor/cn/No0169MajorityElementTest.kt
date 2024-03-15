package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0169MajorityElementTest : AbstractSolutionTest() {

    override val solution = No0169MajorityElement.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.majorityElement(nums = intArrayOf(3,2,3))
        )
        Assertions.assertEquals(
            2,
            solution.majorityElement(nums = intArrayOf(2,2,1,1,1,2,2))
        )
    }
}