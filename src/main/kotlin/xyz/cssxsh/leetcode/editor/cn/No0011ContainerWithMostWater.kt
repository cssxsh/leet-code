package xyz.cssxsh.leetcode.editor.cn

object No0011ContainerWithMostWater {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxArea(height: IntArray): Int {
            var i = 0
            var j = height.size - 1
            var max = 0
            while (true) {
                val h = minOf(height[i], height[j])
                val w = j - i
                val s = h * w
                max = maxOf(s, max)

                if (height[i] <= height[j]) i++ else j--
                if (i >= j) break
            }
            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}