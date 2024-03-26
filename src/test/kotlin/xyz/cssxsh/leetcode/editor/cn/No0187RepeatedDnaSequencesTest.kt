package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0187RepeatedDnaSequencesTest : AbstractSolutionTest() {

    override val solution = No0187RepeatedDnaSequences.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf("AAAAACCCCC", "CCCCCAAAAA"),
            solution.findRepeatedDnaSequences(s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")
        )
        Assertions.assertEquals(
            listOf("AAAAAAAAAA"),
            solution.findRepeatedDnaSequences(s = "AAAAAAAAAAAAA")
        )
    }
}