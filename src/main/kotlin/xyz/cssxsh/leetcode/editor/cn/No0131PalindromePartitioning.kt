package xyz.cssxsh.leetcode.editor.cn

object No0131PalindromePartitioning {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun partition(s: String): List<List<String>> {
            val n = s.length

            val result = ArrayList<List<String>>()
            val parts = ArrayDeque<String>()
            fun dfs(offset: Int) {
                if (offset == n) {
                    result.add(element = parts.toList())
                    return
                }
                for (j in offset + 1 .. n) {
                    val part = s.subSequence(startIndex = offset, endIndex = j)
                    if (part.isPalindrome()) {
                        parts.addLast(element = part.toString())
                        dfs(offset = j)
                        parts.removeLast()
                    }
                }
            }

            dfs(offset = 0)

            return result
        }

        private fun CharSequence.isPalindrome(): Boolean {
            var i = 0
            var j = length - 1
            while (i <= j) {
                if (get(index = i++) != get(index = j--)) return false
            }
            return true
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}