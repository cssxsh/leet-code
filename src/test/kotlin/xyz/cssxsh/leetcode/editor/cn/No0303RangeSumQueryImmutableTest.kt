package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0303RangeSumQueryImmutableTest : AbstractSolutionTest() {

    override val solution = No0303RangeSumQueryImmutable.NumArray::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0303RangeSumQueryImmutable.NumArray(nums = intArrayOf(-2, 0, 3, -5, 2, -1))

            Assertions.assertEquals(
                1,
                instance.sumRange(left = 0, right = 2)
            )
            Assertions.assertEquals(
                -1,
                instance.sumRange(left = 2, right = 5)
            )
            Assertions.assertEquals(
                -3,
                instance.sumRange(left = 0, right = 5)
            )
        }
    }
}