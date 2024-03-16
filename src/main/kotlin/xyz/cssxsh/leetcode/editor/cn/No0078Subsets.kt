package xyz.cssxsh.leetcode.editor.cn

object No0078Subsets {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun subsets(nums: IntArray): List<List<Int>> {
            val hash = nums.fold(initial = 0) { acc, i -> 1 shl (i + 10) or acc }
            fun setOf(num: Int): List<Int> = buildList {
                for (i in 0 .. 20) {
                    if (1 shl i and num != 0) add(element = i - 10)
                }
            }
            return buildList {
                for (i in 0 .. hash) {
                    if (i and hash == i) add(element = setOf(num = i))
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}