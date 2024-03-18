package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0621TaskSchedulerTest : AbstractSolutionTest() {

    override val solution = No0621TaskScheduler.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            8,
            solution.leastInterval(tasks = "AAABBB".toCharArray(), n = 2)
        )
        Assertions.assertEquals(
            6,
            solution.leastInterval(tasks = "AAABBB".toCharArray(), n = 0)
        )
        Assertions.assertEquals(
            16,
            solution.leastInterval(tasks = "AAAAAABCDEFG".toCharArray(), n = 2)
        )
    }
}