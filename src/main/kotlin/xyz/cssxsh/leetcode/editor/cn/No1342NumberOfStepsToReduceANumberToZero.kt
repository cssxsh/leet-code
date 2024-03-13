package xyz.cssxsh.leetcode.editor.cn

class No1342NumberOfStepsToReduceANumberToZero {
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