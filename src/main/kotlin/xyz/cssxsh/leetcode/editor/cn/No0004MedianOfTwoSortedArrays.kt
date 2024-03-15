package xyz.cssxsh.leetcode.editor.cn

object No0004MedianOfTwoSortedArrays {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val left = (nums1.size + nums2.size + 1) / 2
            val right = (nums1.size + nums2.size) / 2 + 1

            var i = 0
            var j = 0
            var l = 0
            var r = 0
            var n = 0
            while (true) {
                val a = nums1.getOrNull(i) ?: 1_000_001
                val b = nums2.getOrNull(j) ?: 1_000_001
                val c = if (a < b) {
                    i++
                    a
                } else {
                    j++
                    b
                }

                n++

                if (n == left) {
                    l = c
                }
                if (n == right) {
                    r = c
                    break
                }
            }

            return (l + r) / 2.0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}