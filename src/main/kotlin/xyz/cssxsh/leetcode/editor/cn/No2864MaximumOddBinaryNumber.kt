package xyz.cssxsh.leetcode.editor.cn

object No2864MaximumOddBinaryNumber {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maximumOddBinaryNumber(s: String): String {
            return buildString(capacity = s.length) {
                for (char in s) {
                    when (char) {
                        '1' -> insert(0, '1')
                        '0' -> append('0')
                    }
                }
                deleteCharAt(0)
                append('1')
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}