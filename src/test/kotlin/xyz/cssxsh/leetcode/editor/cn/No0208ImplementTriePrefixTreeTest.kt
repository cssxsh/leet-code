package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0208ImplementTriePrefixTreeTest : AbstractSolutionTest() {

    override val solution = No0208ImplementTriePrefixTree.Trie()

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            solution.insert(word = "apple")
        }
        Assertions.assertEquals(
            true,
            solution.search(word = "apple")
        )
        Assertions.assertEquals(
            false,
            solution.search(word = "app")
        )
        Assertions.assertEquals(
            true,
            solution.startsWith(prefix = "app")
        )
        Assertions.assertDoesNotThrow {
            solution.insert(word = "app")
        }
        Assertions.assertEquals(
            true,
            solution.search(word = "app")
        )
        Assertions.assertDoesNotThrow {
            println(solution.toString())
        }
    }
}