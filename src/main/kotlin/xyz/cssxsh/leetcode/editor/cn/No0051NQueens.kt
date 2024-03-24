package xyz.cssxsh.leetcode.editor.cn

object No0051NQueens {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun solveNQueens(n: Int): List<List<String>> {
            if (n == 1) return listOf(listOf("Q"))
            if (n == 2 || n == 3) return emptyList()
            val result = ArrayList<List<String>>()
            val stack = ArrayDeque<Int>()

            fun dfs(a: Int, b: Int, c: Int) {
                val offset = stack.size
                if (offset == n) {
                    result.add(element = List(size = n) {
                        val select = stack[it]
                        val chars = CharArray(size = n) { '.' }
                        chars[select] = 'Q'
                        String(chars)
                    })
                    return
                }

                for (i in 0 until n) {
                    val ab = 1 shl i
                    if (a and ab != 0) continue
                    val bb = 1 shl (n - 1 - offset + i)
                    if (b and bb != 0) continue
                    val cb = 1 shl (i + offset)
                    if (c and cb != 0) continue

                    stack.addLast(element = i)
                    dfs(a = a or ab, b = b or bb, c = c or cb)
                    stack.removeLast()
                }
            }

            dfs(a = 0, b = 0, c = 0)

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}