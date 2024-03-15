package xyz.cssxsh.leetcode.editor.cn

object No0136SingleNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun singleNumber(nums: IntArray): Int {
            return nums.fold(initial = 0) { acc, i -> acc xor i } xor 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
