package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*
import xyz.cssxsh.leetcode.editor.cn.data.*

internal class No0138CopyListWithRandomPointerTest : AbstractSolutionTest() {

    override val solution = No0138CopyListWithRandomPointer.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            randomListNodeOf(7 to null, 13 to 0, 11 to 4, 10 to 2, 1 to 0),
            solution.copyRandomList(
                node = randomListNodeOf(
                    7 to null,
                    13 to 0,
                    11 to 4,
                    10 to 2,
                    1 to 0
                ),
            )
        )
    }
}