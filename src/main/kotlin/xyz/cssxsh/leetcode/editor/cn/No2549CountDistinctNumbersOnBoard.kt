package xyz.cssxsh.leetcode.editor.cn

object No2549CountDistinctNumbersOnBoard {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun distinctIntegers(n: Int): Int {
            if (n == 1) return 1

            val result = hashSetOf<Int>()

            fun dfs(n: Int) {
                if (result.add(element = n).not()) return
                if (n == 2) return
                val t = n - 1
                dfs(n = t)
                for (i in 2 .. n) {
                    if (i * i > t) break
                    if (t % i == 0) {
                        dfs(n = i)
                        val other = t / i
                        if (other == i) break
                        dfs(n = other)
                    }
                }
            }

            dfs(n = n)

            return result.size
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}