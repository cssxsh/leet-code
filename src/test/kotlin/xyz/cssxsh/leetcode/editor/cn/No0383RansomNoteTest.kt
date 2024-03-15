package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0383RansomNoteTest : AbstractSolutionTest() {

    override val solution = No0383RansomNote.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            false,
            solution.canConstruct(ransomNote = "a", magazine = "b")
        )
        Assertions.assertEquals(
            false,
            solution.canConstruct(ransomNote = "aa", magazine = "ab")
        )
        Assertions.assertEquals(
            true,
            solution.canConstruct(ransomNote = "aa", magazine = "aab")
        )
    }
}