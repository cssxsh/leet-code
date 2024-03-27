package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0387FirstUniqueCharacterInAStringTest : AbstractSolutionTest() {

    override val solution = No0387FirstUniqueCharacterInAString.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            0,
            solution.firstUniqChar(s = "leetcode")
        )
        Assertions.assertEquals(
            2,
            solution.firstUniqChar(s = "loveleetcode")
        )
        Assertions.assertEquals(
            -1,
            solution.firstUniqChar(s = "aabb")
        )
    }
}