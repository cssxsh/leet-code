package xyz.cssxsh.leetcode.editor.cn

object No0394DecodeString {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun decodeString(s: String): String {
            val n = s.length

            val buffer = ArrayDeque<StringBuilder>()
            val nums = ArrayDeque<Int>()

            buffer.addLast(element = StringBuilder())

            var i = 0
            while (i < n) {
                when (val char = s[i]) {
                    in '0' .. '9' -> {
                        val end = s.indexOf('[', i)
                        val num = s.substring(i, end).toInt()
                        nums.addLast(element = num)
                        i = end
                        continue
                    }
                    '[' -> {
                        buffer.addLast(element = StringBuilder())
                    }
                    ']' -> {
                        val num = nums.removeLast()
                        val builder = buffer.removeLast()
                        repeat(times = num) {
                            buffer.last().append(builder)
                        }
                    }
                    else -> {
                        buffer.last().append(char)
                    }
                }
                i++
            }

            return buffer.last().toString()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}