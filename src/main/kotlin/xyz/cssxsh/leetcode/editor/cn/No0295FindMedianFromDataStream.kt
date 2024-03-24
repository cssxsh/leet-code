package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0295FindMedianFromDataStream {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<MedianFinder>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class MedianFinder {
        private val left = PriorityQueue<Int> { a, b -> b - a }
        private val right = PriorityQueue<Int> { a, b -> a - b }

        fun addNum(num: Int) {
            if (left.size == right.size) {
                if (right.isEmpty() || num <= right.peek()) {
                    left.add(element = num)
                } else {
                    left.add(element = right.poll())
                    right.add(element = num)
                }
            } else {
                if (left.peek() <= num) {
                    right.add(element = num)
                } else {
                    right.add(element = left.poll())
                    left.add(element = num)
                }
            }
        }

        fun findMedian(): Double {
            return if (left.size == right.size) {
                (left.peek() + right.peek()) / 2.0
            } else {
                left.peek() / 1.0
            }
        }

        override fun toString(): String {
            return buildString {
                append("MedianFinder(")
                append("left=$left")
                append(", ")
                append("right=$right")
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}