package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2671FrequencyTrackerTest : AbstractSolutionTest() {

    override val solution = No2671FrequencyTracker.FrequencyTracker::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No2671FrequencyTracker.FrequencyTracker()

            instance.add(number = 3)
            instance.add(number = 3)
            Assertions.assertEquals(
                true,
                instance.hasFrequency(frequency = 2)
            )
        }
        Assertions.assertDoesNotThrow {
            val instance = No2671FrequencyTracker.FrequencyTracker()

            instance.add(number = 1)
            instance.deleteOne(number = 1)
            Assertions.assertEquals(
                false,
                instance.hasFrequency(frequency = 1)
            )
        }
        Assertions.assertDoesNotThrow {
            val instance = No2671FrequencyTracker.FrequencyTracker()

            Assertions.assertEquals(
                false,
                instance.hasFrequency(frequency = 2)
            )
            instance.add(number = 3)
            Assertions.assertEquals(
                true,
                instance.hasFrequency(frequency = 1)
            )
        }
    }
}