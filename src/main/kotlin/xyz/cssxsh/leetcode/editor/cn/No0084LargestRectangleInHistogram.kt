package xyz.cssxsh.leetcode.editor.cn

object No0084LargestRectangleInHistogram {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun largestRectangleArea(heights: IntArray): Int {
            val n = heights.size
            if (n == 1) return heights[0]
            var max = 0

//            for (i in 0 until n) {
//                val h = heights[i]
//
//                var a = i
//                while (a > 0) if (heights[a - 1] >= h) a-- else break
//                var b = i
//                while (b < n - 1) if (heights[b + 1] >= h) b++ else break
//
//                val w = b - a + 1
//
//                max = maxOf(w * h, max)
//            }

            val stack = ArrayDeque<Int>()
            val left = IntArray(size = n) { i ->
                while (!stack.isEmpty() && heights[stack.last()] >= heights[i]) stack.removeLast()
                val top = if (stack.isEmpty()) -1 else stack.last()
                stack.addLast(element = i)
                top
            }
            stack.clear()
            val right = IntArray(size = n) { i ->
                val j = n - i - 1
                while (!stack.isEmpty() && heights[stack.last()] >= heights[j]) stack.removeLast()
                val top = if (stack.isEmpty()) n else stack.last()
                stack.addLast(element = j)
                top
            }
            for (i in 0 until n) {
                val h = heights[i]
                val w = right[n - i - 1] - left[i] - 1

                max = maxOf(w * h, max)
            }

            return max
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}