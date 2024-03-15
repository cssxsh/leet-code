package xyz.cssxsh.leetcode.editor.cn

import org.junit.jupiter.api.*

internal class No0412FizzBuzzTest : AbstractSolutionTest() {

    override val solution = No0412FizzBuzz.Solution()

    @Test
    override fun example() {
        Assertions.assertEquals(
            listOf("1", "2", "Fizz"),
            solution.fizzBuzz(n = 3)
        )
        Assertions.assertEquals(
            listOf("1", "2", "Fizz", "4", "Buzz"),
            solution.fizzBuzz(n = 5)
        )
        Assertions.assertEquals(
            listOf(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
            ),
            solution.fizzBuzz(n = 15)
        )
    }
}