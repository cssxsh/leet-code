package xyz.cssxsh.leetcode.editor.cn

object No0322CoinChange {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
//            if (amount == 0) return 0
//            val count = IntArray(size = amount)
//
//            fun dfs(amount: Int): Int {
//                if (amount < 0) return -1
//                if (amount == 0) return 0
//                if (count[amount - 1] != 0) return count[amount - 1]
//                var min = Int.MAX_VALUE
//
//                for (coin in coins) {
//                    val r = dfs(amount = amount - coin)
//                    if (r in 0 until min) min = r + 1
//                }
//
//                min = if (min == Int.MAX_VALUE) -1 else min
//                count[amount - 1] = min
//
//                return min
//            }
//
//            return dfs(amount = amount)
//            val n = coins.size

            val min = IntArray(size = amount + 1) { 10001 }
            min[0] = 0

            for (coin in coins) {
                for (i in coin .. amount) {
                    min[i] = minOf(min[i - coin] + 1, min[i])
                }
            }

            val result = min[amount]
            return if (result == 10001) -1 else result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}