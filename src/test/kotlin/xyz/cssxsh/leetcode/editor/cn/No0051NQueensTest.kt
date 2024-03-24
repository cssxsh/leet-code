package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0051NQueensTest : AbstractSolutionTest() {

    override val solution = No0051NQueens.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf(
                listOf("Q")
            ),
            solution.solveNQueens(n = 1)
        )
        Assertions.assertEquals(
            emptyList<List<String>>(),
            solution.solveNQueens(n = 2)
        )
        Assertions.assertEquals(
            emptyList<List<String>>(),
            solution.solveNQueens(n = 3)
        )
        Assertions.assertEquals(
            listOf(
                listOf(".Q..", "...Q", "Q...", "..Q."),
                listOf("..Q.", "Q...", "...Q", ".Q..")
            ),
            solution.solveNQueens(n = 4)
        )
    }
}