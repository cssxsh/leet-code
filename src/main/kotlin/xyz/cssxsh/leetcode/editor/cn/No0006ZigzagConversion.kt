package xyz.cssxsh.leetcode.editor.cn

object No0006ZigzagConversion {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun convert(s: String, numRows: Int): String {
            if (numRows == 1) return s
            val n = s.length
            val k = 2 * numRows - 2

            return buildString(capacity = n) {
                for (i in 0 until n step k) {
                    append(s[i])
                }

                for (j in 1 until numRows - 1) {
                    val offset = k - 2 * j
                    for (i in j until n step k) {
                        append(s[i])
                        if (i + offset < n) append(s[i + offset])
                    }
                }

                for (i in numRows - 1 until n step k) {
                    append(s[i])
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}