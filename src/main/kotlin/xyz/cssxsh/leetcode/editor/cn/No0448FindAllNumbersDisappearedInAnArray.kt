package xyz.cssxsh.leetcode.editor.cn

object No0448FindAllNumbersDisappearedInAnArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findDisappearedNumbers(nums: IntArray): List<Int> {
            val buckets = IntArray(size = nums.size)
            for (num in nums) buckets[num - 1]++

            return buildList {
                buckets.forEachIndexed { num, count ->
                    if (count == 0) add(num + 1)
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}