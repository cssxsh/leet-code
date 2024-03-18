package xyz.cssxsh.leetcode.editor.cn

object No0046Permutations {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun permute(nums: IntArray): List<List<Int>> {
            val queue = ArrayDeque<Pair<List<Int>, List<Int>>>()
            val result = mutableListOf<List<Int>>()
            queue.addLast(element = emptyList<Int>() to nums.asList())

            while (queue.isEmpty().not()) {
                val (prev, wait) = queue.removeFirst()
                if (wait.size == 1) {
                    result.add(element = prev + wait)
                    continue
                }
                for (num in wait) {
                    queue.addLast(element = (prev + num) to (wait - num))
                }
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}