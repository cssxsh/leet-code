package xyz.cssxsh.leetcode.editor.cn

object No0264UglyNumberIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun nthUglyNumber(n: Int): Int {
            if (n == 1) return 1

            val dp = IntArray(size = n)
            dp[0] = 1

            var a2 = 0
            var a3 = 0
            var a5 = 0
            for (i in 1 until n) {
                val x2 = dp[a2] * 2
                val x3 = dp[a3] * 3
                val x5 = dp[a5] * 5

                val next = minOf(x2, x3, x5)
                if (next == x2) a2++
                if (next == x3) a3++
                if (next == x5) a5++

                dp[i] = next
            }

            return dp[n - 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}