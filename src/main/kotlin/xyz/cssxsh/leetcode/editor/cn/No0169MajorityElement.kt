package xyz.cssxsh.leetcode.editor.cn

object No0169MajorityElement {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun majorityElement(nums: IntArray): Int {
            var cnt = 0
            var target = null as Int?
            for (num in nums) {
                if (cnt == 0) target = num
                cnt += if (num == target) 1 else -1
            }
            return target!!
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
