package xyz.cssxsh.leetcode.editor.cn

object No0438FindAllAnagramsInAString {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findAnagrams(s: String, p: String): List<Int> {
            if (p.length > s.length) return emptyList()
            val offset = mutableListOf<Int>()
            val cnt = IntArray(size = 'z' - 'a' + 1)
            val target = IntArray(size = 'z' - 'a' + 1)

            for (i in p.indices) {
                cnt[s[i] - 'a'] += 1
                target[p[i] - 'a'] += 1
            }

            if (cnt.contentEquals(target)) offset.add(0)

            for (i in 1 .. s.length - p.length) {
                cnt[s[i - 1] - 'a'] -= 1
                cnt[s[i + p.length - 1] - 'a'] += 1

                if (cnt.contentEquals(target)) offset.add(i)
            }

            return offset
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}