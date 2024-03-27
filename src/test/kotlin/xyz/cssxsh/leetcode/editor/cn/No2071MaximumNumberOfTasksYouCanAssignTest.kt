package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2071MaximumNumberOfTasksYouCanAssignTest : AbstractSolutionTest() {

    override val solution = No2071MaximumNumberOfTasksYouCanAssign.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            3,
            solution.maxTaskAssign(
                tasks = intArrayOf(3, 2, 1),
                workers = intArrayOf(0, 3, 3),
                pills = 1,
                strength = 1
            )
        )
        Assertions.assertEquals(
            1,
            solution.maxTaskAssign(
                tasks = intArrayOf(5, 4),
                workers = intArrayOf(0, 0, 0),
                pills = 1,
                strength = 5
            )
        )
        Assertions.assertEquals(
            2,
            solution.maxTaskAssign(
                tasks = intArrayOf(10, 15, 30),
                workers = intArrayOf(0, 10, 10, 10, 10),
                pills = 3,
                strength = 10
            )
        )
        Assertions.assertEquals(
            3,
            solution.maxTaskAssign(
                tasks = intArrayOf(5, 9, 8, 5, 9),
                workers = intArrayOf(1, 6, 4, 2, 6),
                pills = 1,
                strength = 5
            )
        )
        Assertions.assertEquals(
            5,
            solution.maxTaskAssign(
                tasks = intArrayOf(33, 58, 22, 87, 38),
                workers = intArrayOf(84, 46, 17, 58, 98, 30, 56, 78, 48),
                pills = 0,
                strength = 74
            )
        )
        Assertions.assertEquals(
            1,
            solution.maxTaskAssign(
                tasks = intArrayOf(74, 41, 64, 20, 28, 52, 30, 4, 4, 63),
                workers = intArrayOf(38),
                pills = 0,
                strength = 68
            )
        )
    }
}