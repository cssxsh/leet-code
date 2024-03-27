package xyz.cssxsh.leetcode.editor.cn

object No2071MaximumNumberOfTasksYouCanAssign {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maxTaskAssign(tasks: IntArray, workers: IntArray, pills: Int, strength: Int): Int {
            val m = tasks.size
            val n = workers.size
            tasks.sort()
            workers.sort()

            fun check(target: Int): Boolean {
                var unused = pills
                val wait = ArrayDeque<Int>()
                var j = n - 1
                for (i in target - 1 downTo 0) {
                    val task = tasks[i]
                    while (j >= n - target && workers[j] + strength >= task) {
                        wait.addFirst(element = workers[j])
                        j--
                    }
                    if (wait.isEmpty()) return false
                    when {
                        wait.last() >= task -> wait.removeLast()
                        unused-- == 0 -> return false
                        else -> wait.removeFirst()
                    }
                }
                return true
            }

            var ans = 0
            var left = 1
            var right = minOf(m, n)
            while (left <= right) {
                val middle = (left + right) / 2
                if (check(target = middle)) {
                    ans = middle
                    left = middle + 1
                } else {
                    right = middle - 1
                }
            }

            return ans
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}