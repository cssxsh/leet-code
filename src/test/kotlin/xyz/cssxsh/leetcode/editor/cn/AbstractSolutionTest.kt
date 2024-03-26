package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import kotlin.reflect.*

internal abstract class AbstractSolutionTest {

    protected abstract val solution: Any

    @Test
    open fun run() {
        val classifier = solution as? KClass<*> ?: solution::class
        Assertions.assertEquals(
            this::class.java.name.substringBefore("Test"),
            classifier.java.name.substringBefore("$")
        )
        Assertions.assertDoesNotThrow {
            if (classifier == solution) {
                runInstance(classifier = classifier)
            } else {
                runSolution(classifier = solution::class)
            }
        }
    }

    @Test
    abstract fun example()
}