package xyz.cssxsh.leetcode.editor.cn

object No0015ThreeSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            nums.sort()
            val list = mutableListOf<List<Int>>()

            var i = 0
            var p = null as Int?
            while (i < nums.size - 2) {
                if (nums[i] == p) {
                    i++
                    continue
                }

                var j = i + 1
                var k = nums.size - 1
                var q = null as Int?
                while (j < k) {
                    if (nums[k] == q) {
                        k--
                        continue
                    }

                    val sum = nums[i] + nums[j] + nums[k]
                    if (sum == 0) {
                        list.add(element = listOf(nums[i], nums[j], nums[k]))
                        p = nums[i]
                        q = nums[k]
                    }
                    if (sum >= 0) k--
                    if (sum <= 0) j++
                }

                i++
            }
            return list
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}