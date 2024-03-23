package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0006ZigzagConversionTest : AbstractSolutionTest() {

    override val solution = No0006ZigzagConversion.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "PAHNAPLSIIGYIR",
            solution.convert(s = "PAYPALISHIRING", numRows = 3)
        )
        Assertions.assertEquals(
            "PINALSIGYAHRPI",
            solution.convert(s = "PAYPALISHIRING", numRows = 4)
        )
        Assertions.assertEquals(
            "A",
            solution.convert(s = "A", numRows = 1)
        )
    }
}