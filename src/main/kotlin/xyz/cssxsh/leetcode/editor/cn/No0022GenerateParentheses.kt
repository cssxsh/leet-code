package xyz.cssxsh.leetcode.editor.cn

object No0022GenerateParentheses {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun generateParenthesis(n: Int): List<String> {
            val queue = ArrayDeque<Triple<StringBuilder, Int, Int>>()
            queue.addLast(element = Triple(StringBuilder(), n, n))
            val result = mutableListOf<String>()

            while (queue.isEmpty().not()) {
                val (prev, left, right) = queue.removeFirst()

                if (left == 0 && right == 0) {
                    result.add(element = prev.toString())
                }

                if (left > 0) {
                    queue.addLast(element = Triple(StringBuilder(prev).append('('), left - 1, right))
                }
                if (right > 0 && left < right) {
                    queue.addLast(element = Triple(StringBuilder(prev).append(')'), left, right - 1))
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}