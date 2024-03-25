package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0207CourseScheduleTest : AbstractSolutionTest() {

    override val solution = No0207CourseSchedule.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            true,
            solution.canFinish(
                numCourses = 2,
                prerequisites = arrayOf(
                    intArrayOf(1, 0)
                )
            )
        )
        Assertions.assertEquals(
            false,
            solution.canFinish(
                numCourses = 2,
                prerequisites = arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(0, 1)
                )
            )
        )
    }
}