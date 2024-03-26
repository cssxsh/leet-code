package xyz.cssxsh.leetcode.editor.cn

object No0263UglyNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun isUgly(n: Int): Boolean {
            if (n <= 0) return false
            var x = n
            for (factor in FACTORS) {
                while (x % factor == 0) x /= factor
            }

            return x == 1
        }

        companion object {
            @JvmStatic
            val FACTORS = intArrayOf(2, 3, 5)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}