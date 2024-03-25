package xyz.cssxsh.leetcode.editor.cn

object No0316RemoveDuplicateLetters {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun removeDuplicateLetters(s: String): String {
            val counts = IntArray(size = 'z' - 'a' + 1)
            for (char in s) counts[char - 'a']++
            val used = IntArray(size = 'z' - 'a' + 1)
            val buffer = StringBuilder()

            for (char in s) {
                if (used[char - 'a'] == 0) {
                    while (true) {
                        val length = buffer.length
                        if (length == 0) break
                        val last = buffer[length - 1]
                        if (last <= char || counts[last - 'a'] == 0) break

                        used[last - 'a'] = 0
                        buffer.deleteCharAt(length - 1)
                    }

                    buffer.append(char)
                    used[char - 'a'] = 1
                }
                counts[char - 'a']--
            }

            return buffer.toString()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}