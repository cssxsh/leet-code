package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal abstract class AbstractSolutionTest {

    protected abstract val solution: Any

    @Test
    open fun run() {
        Assertions.assertDoesNotThrow {
            runSolution(classifier = solution::class)
        }
    }

    @Test
    abstract fun example()
}