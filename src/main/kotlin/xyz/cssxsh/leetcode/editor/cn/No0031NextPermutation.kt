package xyz.cssxsh.leetcode.editor.cn

object No0031NextPermutation {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun nextPermutation(nums: IntArray) {
            if (nums.size == 1) return

            var tmp: Int
            val swap = (nums.size - 2 downTo 0)
                .find { nums[it] < nums[it + 1] } ?: -1

            for (j in swap + 1 until nums.size) {
                val k = nums.size + swap - j
                if (j > k) break

                tmp = nums[k]
                nums[k] = nums[j]
                nums[j] = tmp
            }

            if (swap < 0) return

            val target = (swap + 1 until nums.size)
                .find { nums[it] > nums[swap] } ?: (nums.size - 1)

            tmp = nums[swap]
            nums[swap] = nums[target]
            nums[target] = tmp
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}