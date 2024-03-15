package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No2129CapitalizeTheTitleTest : AbstractSolutionTest() {

    override val solution = No2129CapitalizeTheTitle.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            "Capitalize The Title",
            solution.capitalizeTitle(title = "capiTalIze tHe titLe")
        )
        Assertions.assertEquals(
            "First Letter of Each Word",
            solution.capitalizeTitle(title = "First leTTeR of EACH Word")
        )
        Assertions.assertEquals(
            "i Love Leetcode",
            solution.capitalizeTitle(title = "i lOve leetcode")
        )
    }
}