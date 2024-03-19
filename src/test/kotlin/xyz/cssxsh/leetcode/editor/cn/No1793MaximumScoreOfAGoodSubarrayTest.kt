package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No1793MaximumScoreOfAGoodSubarrayTest : AbstractSolutionTest() {

    override val solution = No1793MaximumScoreOfAGoodSubarray.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            15,
            solution.maximumScore(nums = intArrayOf(1, 4, 3, 7, 4, 5), k = 3)
        )
        Assertions.assertEquals(
            20,
            solution.maximumScore(nums = intArrayOf(5, 5, 4, 5, 4, 1, 1, 1), k = 0)
        )
        Assertions.assertEquals(
            5,
            solution.maximumScore(nums = intArrayOf(5), k = 0)
        )
        for ((p1, p2) in readExample(classifier = solution::class).chunked(2)) {
            solution.maximumScore(
                nums = p1.parts().map(String::toInt).toList().toIntArray(),
                k = p2.toInt()
            )
        }
    }
}