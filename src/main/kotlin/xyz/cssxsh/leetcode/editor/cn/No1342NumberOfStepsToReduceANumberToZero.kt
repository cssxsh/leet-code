package xyz.cssxsh.leetcode.editor.cn

object No1342NumberOfStepsToReduceANumberToZero {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun numberOfSteps(num: Int): Int {
            if (num == 0) return 0
            if (num == 1) return 1
            return 1 + (num and 0x01) + numberOfSteps(num / 2)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}