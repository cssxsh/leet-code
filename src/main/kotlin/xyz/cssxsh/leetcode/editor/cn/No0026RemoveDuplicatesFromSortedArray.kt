package xyz.cssxsh.leetcode.editor.cn

object No0026RemoveDuplicatesFromSortedArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun removeDuplicates(nums: IntArray): Int {
            val n = nums.size

            var prev = nums[0]
            var j = 1
            for (i in 1 until n) {
                val num = nums[i]
                if (num > prev) {
                    if (i != j) nums[j] = num
                    j++
                    prev = num
                }
            }

            return j
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}