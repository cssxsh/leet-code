package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2864MaximumOddBinaryNumberTest : AbstractSolutionTest() {

    override val solution = No2864MaximumOddBinaryNumber.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "001",
            solution.maximumOddBinaryNumber(s = "010")
        )
        Assertions.assertEquals(
            "1001",
            solution.maximumOddBinaryNumber(s = "0101")
        )
    }
}