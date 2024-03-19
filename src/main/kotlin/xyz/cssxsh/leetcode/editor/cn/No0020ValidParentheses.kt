package xyz.cssxsh.leetcode.editor.cn

object No0020ValidParentheses {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isValid(s: String): Boolean {
            val stack = ArrayDeque<Char>()
            for (char in s) {
                when (char) {
                    ')' -> if (stack.removeLastOrNull() != '(') return false
                    ']' -> if (stack.removeLastOrNull() != '[') return false
                    '}' -> if (stack.removeLastOrNull() != '{') return false
                    else -> stack.addLast(element = char)
                }
            }
            return stack.isEmpty()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}