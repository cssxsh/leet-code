package xyz.cssxsh.leetcode.editor.cn

object No0014LongestCommonPrefix {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun longestCommonPrefix(strs: Array<String>): String {
            return buildString {
                loop@ while (true) {
                    if (length >= strs[0].length) break@loop
                    val char = strs[0][length]
                    for (text in strs) {
                        if (length >= text.length) break@loop
                        if (text[length] != char) break@loop
                    }
                    append(char)
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}