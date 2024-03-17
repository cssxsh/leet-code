package xyz.cssxsh.leetcode.editor.cn

object No0017LetterCombinationsOfAPhoneNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun letterCombinations(digits: String): List<String> {
            val queue = ArrayDeque<CharArray>()
            val init = digits.toCharArray()
            if (init.isEmpty()) return emptyList()
            queue.addLast(element = init)
            for (index in digits.indices) {
                val possible = when (digits[index]) {
                    '2' -> "abc"
                    '3' -> "def"
                    '4' -> "ghi"
                    '5' -> "jkl"
                    '6' -> "mno"
                    '7' -> "pqrs"
                    '8' -> "tuv"
                    '9' -> "wxyz"
                    else -> ""
                }
                for (i in 0 until queue.size) {
                    val prev = queue.removeFirst()
                    for (char in possible) {
                        val next = prev.clone()
                        next[index] = char
                        queue.addLast(element = next)
                    }
                }
            }

            return queue.map { it.concatToString() }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}