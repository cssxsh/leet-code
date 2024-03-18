package xyz.cssxsh.leetcode.editor.cn

object No0301RemoveInvalidParentheses {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun removeInvalidParentheses(s: String): List<String> {
            val n = s.length

            val queue = ArrayDeque<Set<Int>>()
            queue.addLast(element = emptySet())

            val left = sequence {
                var sum = 0
                for (i in 0 until n) {
                    when (s[i]) {
                        '(' -> sum++
                        ')' -> sum--
                    }
                    if (sum == -1) {
                        yield(value = i)
                        sum = 0
                    }
                }
            }

            val right = sequence {
                var sum = 0
                for (i in (0 until n).reversed()) {
                    when (s[i]) {
                        '(' -> sum++
                        ')' -> sum--
                    }
                    if (sum == 1) {
                        yield(value = i)
                        sum = 0
                    }
                }
            }

            for (l in left) {
                repeat(times = queue.size) {
                    val deleted = queue.removeFirst()
                    for (i in 0 .. l) {
                        if (i in deleted) continue
                        if (s[i] != ')') continue
                        queue.addLast(element = deleted + i)
                    }
                }
            }

            for (r in right) {
                repeat(times = queue.size) {
                    val deleted = queue.removeFirst()
                    for (i in (r until n).reversed()) {
                        if (i in deleted) continue
                        if (s[i] != '(') continue
                        queue.addLast(element = deleted + i)
                    }
                }
            }

            return queue.mapTo(hashSetOf()) { deleted ->
                val buffer = StringBuilder(s)
                for ((j, i) in deleted.sorted().withIndex()) {
                    buffer.deleteCharAt(i - j)
                }
                buffer.toString()
            }.toList()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}