package xyz.cssxsh.leetcode.editor.cn

object No0010RegularExpressionMatching {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isMatch(s: String, p: String): Boolean {
            val n = s.length
            val m = p.length

            val stack = ArrayDeque<Pair<Int, Int>>()
            stack.addLast(element = 0 to 0)

            while (stack.isEmpty().not()) {
                val (i, j) = stack.removeLast()
                if (i == n && j == m) return true
                if (i == n || j == m) {
                    if (j + 1 < m && p[j + 1] == '*') stack.addLast(element = i to (j + 2))
                    continue
                }

                val a = s[i]
                val b = p[j]

                when {
                    (j + 1 < m) && p[j + 1] == '*' -> {
                        stack.addLast(element = i to (j + 2))
                        for (x in i until n) {
                            if (s[x] != b && b != '.') break
                            stack.addLast(element = (x + 1) to (j + 2))
                        }
                    }
                    a == b || b == '.' -> {
                        stack.addLast(element = (i + 1) to (j + 1))
                    }
                }
            }

            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}