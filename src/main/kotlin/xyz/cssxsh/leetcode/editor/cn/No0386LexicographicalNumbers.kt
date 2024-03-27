package xyz.cssxsh.leetcode.editor.cn

object No0386LexicographicalNumbers {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun lexicalOrder(n: Int): List<Int> {
            if (n < 1) return emptyList()
            var prev = 1
            return List(size = n) {
                val current = prev
                if (prev * 10 <= n) {
                    prev *= 10
                } else {
                    while (prev + 1 > n || prev % 10 == 9) prev /= 10
                    prev++
                }
                current
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}