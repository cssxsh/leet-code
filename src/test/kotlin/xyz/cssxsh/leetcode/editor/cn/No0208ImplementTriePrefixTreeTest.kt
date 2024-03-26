package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0208ImplementTriePrefixTreeTest : AbstractSolutionTest() {

    override val solution = No0208ImplementTriePrefixTree.Trie::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0208ImplementTriePrefixTree.Trie()
            instance.insert(word = "apple")
            Assertions.assertEquals(
                true,
                instance.search(word = "apple")
            )
            Assertions.assertEquals(
                false,
                instance.search(word = "app")
            )
            Assertions.assertEquals(
                true,
                instance.startsWith(prefix = "app")
            )
            instance.insert(word = "app")
            Assertions.assertEquals(
                true,
                instance.search(word = "app")
            )
        }
    }
}