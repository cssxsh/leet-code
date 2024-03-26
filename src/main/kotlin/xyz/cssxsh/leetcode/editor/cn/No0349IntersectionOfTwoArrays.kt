package xyz.cssxsh.leetcode.editor.cn

object No0349IntersectionOfTwoArrays {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
            val m = nums1.size
            val n = nums2.size
            nums1.sort()
            nums2.sort()

            var index = 0
            var j = 0
            var i = 0
            val intersection = IntArray(size = m + n)
            while (j < m && i < n) {
                val num1 = nums1[j]
                val num2 = nums2[i]
                if (num1 == num2) {
                    if (index == 0 || num1 != intersection[index - 1]) {
                        intersection[index++] = num2
                    }
                    j++
                    i++
                } else if (num1 < num2) {
                    j++
                } else {
                    i++
                }
            }

            return intersection.sliceArray(0 until index)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}