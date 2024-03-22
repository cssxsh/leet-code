package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0146LruCacheTest : AbstractSolutionTest() {

    override val solution = No0146LruCache.LRUCache(capacity = 2)

    @Test
    override fun run() {
        Assertions.assertDoesNotThrow {
            runInstance(classifier = solution::class)
        }
    }

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            solution.put(key = 1, value = 1)
            solution.put(key = 2, value = 2)
        }
        Assertions.assertEquals(
            1,
            solution.get(key = 1)
        )
        Assertions.assertDoesNotThrow {
            solution.put(key = 3, value = 3)
        }
        Assertions.assertEquals(
            -1,
            solution.get(key = 2)
        )
        Assertions.assertDoesNotThrow {
            solution.put(key = 4, value = 4)
        }
        Assertions.assertEquals(
            -1,
            solution.get(key = 1)
        )
        Assertions.assertEquals(
            3,
            solution.get(key = 3)
        )
        Assertions.assertEquals(
            4,
            solution.get(key = 4)
        )
    }
}