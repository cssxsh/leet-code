package xyz.cssxsh.leetcode.editor.cn

object No0739DailyTemperatures {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun dailyTemperatures(temperatures: IntArray): IntArray {
            val answer = IntArray(size = temperatures.size) { Int.MAX_VALUE }
            val map = hashMapOf<Int, Int>()
            for (day in temperatures.size - 1 downTo 0) {
                val temperature = temperatures[day]
                map[temperature] = day
                for (hot in temperature + 1 .. 100) {
                    val future = map[hot] ?: continue
                    answer[day] = minOf(future - day, answer[day])
                }
                if (answer[day] == Int.MAX_VALUE) answer[day] = 0
            }
            return answer
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}