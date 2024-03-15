package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0049GroupAnagramsTest : AbstractSolutionTest() {

    override val solution = No0049GroupAnagrams.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat")),
            solution.groupAnagrams(strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        )
        Assertions.assertEquals(
            listOf(listOf("")),
            solution.groupAnagrams(strs = arrayOf("")),
        )
        Assertions.assertEquals(
            listOf(listOf("a")),
            solution.groupAnagrams(strs = arrayOf("a"))
        )

    }
}