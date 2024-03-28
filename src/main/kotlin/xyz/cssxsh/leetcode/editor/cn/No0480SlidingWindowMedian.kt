package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0480SlidingWindowMedian {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
            val n = nums.size
            val result = DoubleArray(size = n - k + 1)

            if (k == 1) {
                for (i in 0 until n) result[i] = nums[i].toDouble()
                return result
            }

            val left = PriorityQueue<Int> { a, b -> b.compareTo(a) }
            val right = PriorityQueue<Int> { a, b -> a.compareTo(b) }
            val middle = k / 2
            val odd = k and 1 == 1

            for (i in 0 until k) left.add(element = nums[i])
            while (left.size > middle) right.add(element = left.poll())

            result[0] = if (odd) right.peek().toDouble() else left.peek() / 2.0 + right.peek() / 2.0

            for (i in k until n) {
                val prev = nums[i - k]
                val next = nums[i]

                left.add(element = next)
                right.add(element = left.poll())
                if (left.remove(element = prev)) left.add(element = right.poll()) else right.remove(element = prev)

                result[i - k + 1] = if (odd) right.peek().toDouble() else left.peek() / 2.0 + right.peek() / 2.0
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}