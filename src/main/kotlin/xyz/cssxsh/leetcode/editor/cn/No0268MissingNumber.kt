package xyz.cssxsh.leetcode.editor.cn

object No0268MissingNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun missingNumber(nums: IntArray): Int {
            val n = nums.size

            for (i in 0 until n) {
                while (nums[i] in 0 until n) {
                    val num = nums[i]
                    if (nums[num] == num) break
                    nums[i] = nums[num]
                    nums[num] = num
                }
            }

            for (i in 0 until n) {
                if (nums[i] != i) return i
            }

            return n
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}