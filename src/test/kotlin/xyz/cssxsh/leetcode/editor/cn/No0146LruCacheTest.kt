package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0146LruCacheTest : AbstractSolutionTest() {

    override val solution = No0146LruCache.LRUCache::class

    @Test
    override fun example() {
        Assertions.assertDoesNotThrow {
            val instance = No0146LruCache.LRUCache(capacity = 2)

            instance.put(key = 1, value = 1)
            instance.put(key = 2, value = 2)
            Assertions.assertEquals(
                1,
                instance.get(key = 1)
            )
            instance.put(key = 3, value = 3)
            Assertions.assertEquals(
                -1,
                instance.get(key = 2)
            )
            instance.put(key = 4, value = 4)
            Assertions.assertEquals(
                -1,
                instance.get(key = 1)
            )
            Assertions.assertEquals(
                3,
                instance.get(key = 3)
            )
            Assertions.assertEquals(
                4,
                instance.get(key = 4)
            )
        }
    }
}