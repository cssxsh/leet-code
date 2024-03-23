package xyz.cssxsh.leetcode.editor.cn

object No0139WordBreak {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {
            val n = s.length

            val failure = hashSetOf<Int>()

            fun dfs(offset: Int): Boolean {
                if (offset == n) return true
                if (offset in failure) return false

                for (word in wordDict) {
                    val end = offset + word.length
                    if (n < end) continue
                    if (s.subSequence(startIndex = offset, endIndex = end) != word) continue
                    if (dfs(offset = end)) return true
                }

                failure.add(element = offset)

                return false
            }

            return dfs(offset = 0)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}