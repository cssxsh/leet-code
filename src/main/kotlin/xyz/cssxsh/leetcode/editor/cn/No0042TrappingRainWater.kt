package xyz.cssxsh.leetcode.editor.cn

object No0042TrappingRainWater {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun trap(height: IntArray): Int {
            val l = IntArray(size = height.size) { 0 }
            val r = IntArray(size = height.size) { 0 }
            for (i in 1 until height.size) {
                l[i] = maxOf(l[i - 1], height[i - 1])
                r[height.size - i - 1] = maxOf(r[height.size - i], height[height.size - i])
            }

            var s = 0
            for (i in height.indices) {
                val h = minOf(l[i], r[i])
                if (h <= height[i]) continue
                s += h - height[i]
            }

            return s
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
