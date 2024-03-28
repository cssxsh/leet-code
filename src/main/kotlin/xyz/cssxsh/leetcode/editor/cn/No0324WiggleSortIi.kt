package xyz.cssxsh.leetcode.editor.cn

object No0324WiggleSortIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun wiggleSort(nums: IntArray) {
            val n = nums.size
            nums.sort()
            val sorted = nums.clone()
            val middle = (n - 1) / 2

            for (i in 0 until n) {
                val target = if (i > middle) (n - 1 - i) * 2 + 1 else (middle - i) * 2
                nums[target] = sorted[i]
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}