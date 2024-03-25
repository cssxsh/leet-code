package xyz.cssxsh.leetcode.editor.cn

object No0933NumberOfRecentCalls {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<RecentCounter>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class RecentCounter {
        private val cache = ArrayDeque<Int>(initialCapacity = 3001)

        fun ping(t: Int): Int {
            cache.add(element = t)
            while (t - cache.first() > 3000) cache.removeFirst()
            return cache.size
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}