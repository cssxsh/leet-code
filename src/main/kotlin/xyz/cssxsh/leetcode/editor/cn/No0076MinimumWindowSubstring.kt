package xyz.cssxsh.leetcode.editor.cn

object No0076MinimumWindowSubstring {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun minWindow(s: String, t: String): String {
            val n = s.length
            val m = t.length

            if (m > n) return ""

            val source = IntArray(size = 'z' - 'A' + 1)
            for (char in s) source[char - 'A']++

            val target = IntArray(size = 'z' - 'A' + 1)
            for (char in t) target[char - 'A']++

            val range = ('A' .. 'z').filter { target[it - 'A'] > 0 }

            for (char in range) if (target[char - 'A'] > source[char - 'A']) return ""

            val current = IntArray(size = 'z' - 'A' + 1)
            for (index in 0 until m) current[s[index] - 'A']++

            var i = 0
            var j = m - 1

            var a = 1
            var b = n
            var min = Int.MAX_VALUE

            loop@ while (true) {
                for (char in range) {
                    val right = char - 'A'
                    while (target[right] > current[right]) {
                        j++
                        if (j < n) current[s[j] - 'A']++ else break@loop
                    }
                }

                var left = s[i] - 'A'
                while (current[left] > target[left]) {
                    current[left]--
                    i++
                    if (i < n) left = s[i] - 'A' else break@loop
                }

//                println(s.subSequence(i, j + 1))
                if (j - i + 1 < min) {
                    min = j - i + 1
                    a = i
                    b = j
                }
//                println("$a, $b")

                current[left]--
                i++
            }

            return s.substring(a, b + 1)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}