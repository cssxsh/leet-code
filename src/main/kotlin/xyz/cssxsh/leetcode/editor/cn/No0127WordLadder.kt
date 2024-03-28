package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0127WordLadder {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [最短路](https://oi-wiki.org/graph/shortest-path/)
         */
        fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
            if (endWord !in wordList) return 0
            val queue = PriorityQueue<Pair<Int, String>> { (a), (b) -> a.compareTo(b) }
            val dist = HashMap<String, Int>()

            dist[beginWord] = 0
            queue.offer(0 to beginWord)
            while (queue.isEmpty().not()) {
                val (count, current) = queue.poll()
                val cost = count + 1
                if (current == endWord) return cost

                for (word in wordList) {
                    if (word adjacent current && (dist[word] ?: Int.MAX_VALUE) > cost) {
                        dist[word] = cost
                        queue.offer(cost to word)
                    }
                }
            }

            return 0
        }

        private infix fun String.adjacent(other: String): Boolean {
            return (this zip other).count { (a, b) -> a != b } == 1
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}