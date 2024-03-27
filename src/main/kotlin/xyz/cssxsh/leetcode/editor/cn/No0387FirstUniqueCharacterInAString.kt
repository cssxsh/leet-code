package xyz.cssxsh.leetcode.editor.cn

object No0387FirstUniqueCharacterInAString {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun firstUniqChar(s: String): Int {
            val n = s.length
            val counts = IntArray(size = 'z' - 'a' + 1)
            for (char in s) counts[char - 'a']++

            for (i in 0 until n) {
                if (counts[s[i] - 'a'] == 1) return i
            }

            return -1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}