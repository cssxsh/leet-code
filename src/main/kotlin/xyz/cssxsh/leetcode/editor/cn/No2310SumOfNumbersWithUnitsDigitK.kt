package xyz.cssxsh.leetcode.editor.cn

object No2310SumOfNumbersWithUnitsDigitK {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minimumNumbers(num: Int, k: Int): Int {
            if (num == 0) return 0
            for (i in 1 .. 10) {
                val s = num - i * k
                if (s < 0) return -1
                if (s % 10 == 0) return i
            }
            return -1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}