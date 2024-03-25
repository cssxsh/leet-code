package xyz.cssxsh.leetcode.editor.cn

object No1979FindGreatestCommonDivisorOfArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findGCD(nums: IntArray): Int {

            var max = nums.max()
            var min = nums.min()

            if (max == min) return max

            var i = 0
            while (max.inv() and 1 == 1 && min.inv() and 1 == 1) {
                max = max shr 1
                min = min shr 1
                i++
            }

            while (true) {
                val c = max - min
                if (c == min) break
                if (c > min) {
                    max = c
                } else {
                    max = min
                    min = c
                }
            }

            return min shl i
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}