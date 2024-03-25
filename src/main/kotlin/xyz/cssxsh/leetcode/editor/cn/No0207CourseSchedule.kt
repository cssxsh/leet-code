package xyz.cssxsh.leetcode.editor.cn

object No0207CourseSchedule {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
            val id = IntArray(size = numCourses)

            for ((a, _) in prerequisites) id[a]++

            val queue = ArrayDeque<Int>()

            for (i in 0 until numCourses) {
                if (id[i] == 0) queue.addLast(element = i)
            }

            var count = 0
            while (queue.isEmpty().not()) {
                val course = queue.removeFirst()
                for ((a, b) in prerequisites) {
                    if (b != course) continue
                    if (--id[a] == 0) queue.addLast(element = a)
                }
                count++
            }

            return count == numCourses
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}