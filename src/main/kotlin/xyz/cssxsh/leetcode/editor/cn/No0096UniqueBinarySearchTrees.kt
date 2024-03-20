package xyz.cssxsh.leetcode.editor.cn

object No0096UniqueBinarySearchTrees {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [卡特兰数](https://oi-wiki.org/math/combinatorics/catalan/)
         */
        fun numTrees(n: Int): Int {
            var c = 1L
            for (i in 0 until n) c = c * 2 * (2 * i + 1) / (i + 2)
            return c.toInt()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}