package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0108ConvertSortedArrayToBinarySearchTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun sortedArrayToBST(nums: IntArray): TreeNode? {
            return node(nums = nums, start = 0, end = nums.size)
        }

        private fun node(nums: IntArray, start: Int, end: Int): TreeNode? {
            if (end <= start) return null

            val mid = (start + end) / 2
            val root = TreeNode(nums[mid])
            root.left = node(nums = nums, start = start, end = mid)
            root.right = node(nums = nums, start = mid + 1, end = end)

            return root
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}