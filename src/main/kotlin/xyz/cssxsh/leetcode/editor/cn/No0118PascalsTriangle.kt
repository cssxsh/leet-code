package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0118PascalsTriangle {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun generate(numRows: Int): List<List<Int>> {
            val result = ArrayList<List<Int>>(numRows)
            result.add(element = listOf(1))
            for (i in 1 until numRows) {
                val prev = result[i - 1]
                result.add(element = MutableList(size = i + 1) { j ->
                    if (j == 0 || j == i) 1 else prev[j] + prev[j - 1]
                })
            }
            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}