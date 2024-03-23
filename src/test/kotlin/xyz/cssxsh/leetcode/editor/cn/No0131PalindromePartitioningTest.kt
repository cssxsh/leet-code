package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0131PalindromePartitioningTest : AbstractSolutionTest() {

    override val solution = No0131PalindromePartitioning.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf("a", "a", "b"),
                listOf("aa", "b"),
            ),
            solution.partition(s = "aab")
        )
        Assertions.assertEquals(
            listOf(
                listOf("a")
            ),
            solution.partition(s = "a")
        )
    }
}