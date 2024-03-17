package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0303RangeSumQueryImmutableTest : AbstractSolutionTest() {

    override val solution = No0303RangeSumQueryImmutable.NumArray(nums = intArrayOf(-2, 0, 3, -5, 2, -1))

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.sumRange(left = 0, right = 2)
        )
        Assertions.assertEquals(
            -1,
            solution.sumRange(left = 2, right = 5)
        )
        Assertions.assertEquals(
            -3,
            solution.sumRange(left = 0, right = 5)
        )
    }
}