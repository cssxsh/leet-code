package xyz.cssxsh.leetcode.editor.cn

object No0049GroupAnagrams {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun groupAnagrams(strs: Array<String>): List<List<String>> {
            return strs.groupBy { str -> str.sort() }.values.toList()
        }

        private fun String.sort(): String {
            return String(toCharArray().apply { sort() })
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}