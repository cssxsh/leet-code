package xyz.cssxsh.leetcode.editor.cn

object No0013RomanToInteger {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun romanToInt(s: String): Int {
            val n = s.length
            var value = 0
            var prev = '?'
            var i = 0
            while (i < n) {
                when (s[i]) {
                    'I' -> {
                        value += 1
                    }
                    'V' -> {
                        value += 5
                        if (prev == 'I') value -= 2
                    }
                    'X' -> {
                        value += 10
                        if (prev == 'I') value -= 2
                    }
                    'L' -> {
                        value += 50
                        if (prev == 'X') value -= 20
                    }
                    'C' -> {
                        value += 100
                        if (prev == 'X') value -= 20
                    }
                    'D' -> {
                        value += 500
                        if (prev == 'C') value -= 200
                    }
                    'M' -> {
                        value += 1000
                        if (prev == 'C') value -= 200
                    }
                }
                prev = s[i]
                i++
            }

            return value
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}