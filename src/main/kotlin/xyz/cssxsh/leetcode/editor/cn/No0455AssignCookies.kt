package xyz.cssxsh.leetcode.editor.cn

object No0455AssignCookies {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findContentChildren(g: IntArray, s: IntArray): Int {
            val m = g.size
            val n = s.size
            g.sort()
            s.sort()
            var count = 0
            var j = 0
            var i = 0
            while (j < m && i < n) {
                while (i < n && g[j] > s[i]) i++
                if (i < n) count++
                j++
                i++
            }

            return count
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}