package xyz.cssxsh.leetcode.editor.cn

object No0321CreateMaximumNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxNumber(nums1: IntArray, nums2: IntArray, k: Int): IntArray {
            val m = nums1.size
            val n = nums2.size
            var max = IntArray(size = k)

            val start = (k - n).coerceAtLeast(0)
            val end = minOf(k, m)

            for (i in start .. end) {
                val merge = nums1.maxSubSequence(k = i) + nums2.maxSubSequence(k = k - i)
                if (merge to 0 > max to 0) max = merge
            }

            return max
        }

        private fun IntArray.maxSubSequence(k: Int): IntArray {
            val result = IntArray(size = k)
            var top = -1
            var remain = this.size - k
            for (num in this) {
                while (top >= 0 && result[top] < num && remain > 0) {
                    top--
                    remain--
                }
                if (top < k - 1) {
                    result[++top] = num
                } else {
                    remain--
                }
            }
            return result
        }

        private operator fun IntArray.plus(other: IntArray): IntArray {
            val m = this.size
            if (m == 0) return other
            val n = other.size
            if (n == 0) return this
            var j = 0
            var i = 0
            return IntArray(size = m + n) {
                if (this to j > other to i) this[j++] else other[i++]
            }
        }

        private operator fun Pair<IntArray, Int>.compareTo(other: Pair<IntArray, Int>): Int {
            val (nums1, offset1) = this
            val (nums2, offset2) = other
            val m = nums1.size
            val n = nums2.size
            var j = offset1
            var i = offset2
            while (j < m && i < n) {
                val difference = nums1[j] - nums2[i]
                if (difference != 0) return difference
                j++
                i++
            }
            return (m - j) - (n - i)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}