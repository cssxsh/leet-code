package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2671FrequencyTrackerTest : AbstractSolutionTest() {

    override val solution = No2671FrequencyTracker.FrequencyTracker()

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        val example1 = No2671FrequencyTracker.FrequencyTracker()
        Assertions.assertDoesNotThrow {
            example1.add(number = 3)
            example1.add(number = 3)
        }
        Assertions.assertEquals(
            true,
            example1.hasFrequency(frequency = 2)
        )
        val example2 = No2671FrequencyTracker.FrequencyTracker()
        Assertions.assertDoesNotThrow {
            example2.add(number = 1)
            example2.deleteOne(number = 1)
        }
        Assertions.assertEquals(
            false,
            example2.hasFrequency(frequency = 1)
        )
        val example3 = No2671FrequencyTracker.FrequencyTracker()
        Assertions.assertEquals(
            false,
            example3.hasFrequency(frequency = 2)
        )
        Assertions.assertDoesNotThrow {
            example3.add(number = 3)
        }
        Assertions.assertEquals(
            true,
            example3.hasFrequency(frequency = 1)
        )
    }
}