package xyz.cssxsh.leetcode.editor.cn

object No2312SellingPiecesOfWood {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun sellingWood(m: Int, n: Int, prices: Array<IntArray>): Long {
            return sellingWood(m = m, n = n, prices = prices, cache = hashMapOf())
        }

        private fun sellingWood(m: Int, n: Int, prices: Array<IntArray>, cache: MutableMap<Int, Long>): Long {
            val s = cache[m * 256 + n]
            if (s != null) return s
            var max = 0L

            for ((h, w, price) in prices) {
                if (h > m || w > n) continue
                max = maxOf(max, price.toLong())
            }
            if (max == 0L) {
                cache[m * 256 + n] = 0
                return 0
            }

            for (i in 1 .. m / 2) {
                val l = sellingWood(m = i, n = n, prices = prices, cache = cache)
                val r = sellingWood(m = m - i, n = n, prices = prices, cache = cache)
                max = maxOf(max, l + r)
            }

            for (i in 1 .. n / 2) {
                val u = sellingWood(m = m, n = i, prices = prices, cache = cache)
                val d = sellingWood(m = m, n = n - i, prices = prices, cache = cache)
                max = maxOf(max, u + d)
            }

            cache[m * 256 + n] = max

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}