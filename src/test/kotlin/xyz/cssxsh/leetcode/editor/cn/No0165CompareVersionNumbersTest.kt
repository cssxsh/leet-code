package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0165CompareVersionNumbersTest : AbstractSolutionTest() {

    override val solution = No0165CompareVersionNumbers.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            0,
            solution.compareVersion(version1 = "1.01", version2 = "1.001")
        )
        Assertions.assertEquals(
            1,
            solution.compareVersion(version1 = "1.01", version2 = "1.0.0")
        )
        Assertions.assertEquals(
            -1,
            solution.compareVersion(version1 = "0.1", version2 = "1.1")
        )
    }
}