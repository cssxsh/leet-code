package xyz.cssxsh.leetcode.editor.cn

object No0041FirstMissingPositive {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun firstMissingPositive(nums: IntArray): Int {
            val n = nums.size

            for (i in 0 until n) {
                while (nums[i] in 1 .. n) {
                    val num = nums[i]
                    if (nums[num - 1] == num) break
                    nums[i] = nums[num - 1]
                    nums[num - 1] = num
                }
            }

            for (i in 0 until n) {
                if (nums[i] != i + 1) return i + 1
            }

            return n + 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}