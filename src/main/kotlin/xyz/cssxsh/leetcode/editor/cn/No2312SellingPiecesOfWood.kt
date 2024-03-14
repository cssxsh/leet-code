package xyz.cssxsh.leetcode.editor.cn

object No2312SellingPiecesOfWood {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private val result = hashMapOf<Int, Long>()

        fun sellingWood(m: Int, n: Int, prices: Array<IntArray>): Long {

            val s = result[m * 256 + n]
            if (s != null) return s
            var max = 0L

            for ((h, w, price) in prices) {
                if (h > m || w > n) continue
                max = maxOf(max, price.toLong())
            }
            if (max == 0L) {
                result[m * 256 + n] = 0
                return 0
            }

            for (i in 1 .. m / 2) {
                val l = sellingWood(m = i, n = n, prices = prices)
                val r = sellingWood(m = m - i, n = n, prices = prices)
                max = maxOf(max, l + r)
            }

            for (i in 1 .. n / 2) {
                val u = sellingWood(m = m, n = i, prices = prices)
                val d = sellingWood(m = m, n = n - i, prices = prices)
                max = maxOf(max, u + d)
            }

            result[m * 256 + n] = max

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}