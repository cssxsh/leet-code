package xyz.cssxsh.leetcode.editor.cn

object No0219ContainsDuplicateIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
            if (k == 0) return false
            val n = nums.size
            val record = hashSetOf<Int>()
            for (i in 0 until n) {
                if (i > k) record.remove(element = nums[i - k - 1])
                if (record.add(element = nums[i]).not()) return true
            }
            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}