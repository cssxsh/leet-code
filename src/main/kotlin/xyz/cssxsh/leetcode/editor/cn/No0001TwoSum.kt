package xyz.cssxsh.leetcode.editor.cn

class No0001TwoSum {
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