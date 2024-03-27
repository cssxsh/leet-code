package xyz.cssxsh.leetcode.editor.cn

object No1997FirstDayWhereYouHaveBeenInAllTheRooms {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun firstDayBeenInAllRooms(nextVisit: IntArray): Int {
            val n = nextVisit.size

            val dp = IntArray(size = n)

            for (i in 1 until n) {
                dp[i] = (dp[i - 1] * 2 % 10_0000_0007 - dp[nextVisit[i - 1]] + 2 + 10_0000_0007) % 10_0000_0007
            }

            return dp[n - 1]
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}