package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0155MinStackTest : AbstractSolutionTest() {

    override val solution = No0155MinStack.MinStack::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0155MinStack.MinStack()

            instance.push(-2)
            instance.push(0)
            instance.push(-3)
            Assertions.assertEquals(
                -3,
                instance.getMin()
            )
            instance.pop()
            Assertions.assertEquals(
                0,
                instance.top()
            )
            Assertions.assertEquals(
                -2,
                instance.getMin()
            )
        }
    }
}