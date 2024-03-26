package xyz.cssxsh.leetcode.editor.cn

object No0088MergeSortedArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
            if (n == 0) return

            var i = m - 1
            var j = n - 1
            var last = m + n - 1
            while (j >= 0) {
                nums1[last] = if (i < 0 || nums2[j] >= nums1[i]) nums2[j--] else nums1[i--]
                last--
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}