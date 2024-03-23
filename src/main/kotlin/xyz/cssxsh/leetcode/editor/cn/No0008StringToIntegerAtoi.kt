package xyz.cssxsh.leetcode.editor.cn

object No0008StringToIntegerAtoi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun myAtoi(s: String): Int {
            var input = false
            var sign = 1
            var value = 0
            for (char in s) {
                when (char) {
                    '+', '-' -> {
                        if (input) break
                        input = true
                        sign *= ',' - char
                    }
                    ' ' -> {
                        if (input) break
                    }
                    in '0' .. '9' -> {
                        input = true
                        if (value > 214748364 || (value == 214748364 && char > '7')) {
                            when (sign) {
                                -1 -> return Int.MIN_VALUE
                                1 -> return Int.MAX_VALUE
                            }
                        }
                        value *= 10
                        value += char - '0'
                    }
                    else -> break
                }
            }
            return sign * value
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}