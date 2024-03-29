package xyz.cssxsh.leetcode.editor.cn

object No0001TwoSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val map = hashMapOf<Int, Int>()
            nums.forEachIndexed { current, num ->
                val o = target - num
                val prev = map[o]
                if (prev != null) return intArrayOf(prev, current)
                map[num] = current
            }
            return intArrayOf()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}