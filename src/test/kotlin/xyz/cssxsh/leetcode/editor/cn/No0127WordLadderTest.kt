package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0127WordLadderTest : AbstractSolutionTest() {

    override val solution = No0127WordLadder.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            5,
            solution.ladderLength(
                beginWord = "hit",
                endWord = "cog",
                wordList = listOf("hot", "dot", "dog", "lot", "log", "cog")
            )
        )
        Assertions.assertEquals(
            0,
            solution.ladderLength(
                beginWord = "hit",
                endWord = "cog",
                wordList = listOf("hot", "dot", "dog", "lot", "log")
            )
        )
    }
}