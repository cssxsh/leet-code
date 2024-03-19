package xyz.cssxsh.leetcode.editor.cn

object No0338CountingBits {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun countBits(n: Int): IntArray {
            val counts = IntArray(size = n + 1)
            var x = 1
            for (i in 1 .. n) {
                val prev = i - x
                if (prev == x) {
                    x *= 2
                    counts[i] = 1
                } else {
                    counts[i] = counts[prev] + 1
                }
            }

            return counts
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}