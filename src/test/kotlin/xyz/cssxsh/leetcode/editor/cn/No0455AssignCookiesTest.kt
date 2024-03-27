package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0455AssignCookiesTest : AbstractSolutionTest() {

    override val solution = No0455AssignCookies.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            1,
            solution.findContentChildren(
                g = intArrayOf(1, 2, 3),
                s = intArrayOf(1, 1)
            )
        )
        Assertions.assertEquals(
            2,
            solution.findContentChildren(
                g = intArrayOf(1, 2),
                s = intArrayOf(1, 2, 3)
            )
        )
    }
}