package xyz.cssxsh.leetcode.editor.cn

object No0069Sqrtx {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun mySqrt(x: Int): Int {
            if (x == 0) return 0
            if (x >= 2147395600) return 46340

            var result = 0
            var left = 0
            var right = 46340
            while (left <= right) {
                val mid = (left + right) / 2
                if (mid * mid <= x) {
                    result = mid
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}