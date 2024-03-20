package xyz.cssxsh.leetcode.editor.cn

object No0239SlidingWindowMaximum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
            if (k == 1) return nums
            val n = nums.size
            val result = IntArray(size = n - k + 1)

            val deque = ArrayDeque<Int>(initialCapacity = k)
            for (i in 0 until k) {
                while (deque.isEmpty().not() && nums[i] >= nums[deque.last()]) deque.removeLast()
                deque.addLast(element = i)
            }
            result[0] = nums[deque.first()]
            for (i in k until n) {
                while (deque.isEmpty().not() && nums[i] >= nums[deque.last()]) deque.removeLast()
                deque.addLast(element = i)
                while (deque.first() <= i - k) deque.removeFirst()

                result[i - k + 1] = nums[deque.first()]
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}