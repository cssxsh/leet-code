package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0155MinStackTest : AbstractSolutionTest() {

    override val solution = No0155MinStack.MinStack()

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            solution.push(-2)
        }
        Assertions.assertDoesNotThrow {
            solution.push(0)
        }
        Assertions.assertDoesNotThrow {
            solution.push(-3)
        }
        Assertions.assertEquals(
            -3,
            solution.getMin()
        )
        Assertions.assertDoesNotThrow {
            solution.pop()
        }
        Assertions.assertEquals(
            0,
            solution.top()
        )
        Assertions.assertEquals(
            -2,
            solution.getMin()
        )
    }
}