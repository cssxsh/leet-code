package xyz.cssxsh.leetcode.editor.cn

object No0003LongestSubstringWithoutRepeatingCharacters {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun lengthOfLongestSubstring(s: String): Int {
            if (s.isEmpty()) return 0
            var i = 0
            var j = 0
            var l = 1
            while (i < s.length) {
                j = i + 1
                val map = hashMapOf<Char, Int>()
                map[s[i]] = i
                while (j < s.length) {
                    val p = map[s[j]] ?: -1
                    if (p >= i) break
                    map[s[j]] = j
                    l = maxOf(j - i + 1, l)
                    j++
                }
                i++
            }

            return l
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}