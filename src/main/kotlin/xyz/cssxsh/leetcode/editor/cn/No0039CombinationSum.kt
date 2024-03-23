package xyz.cssxsh.leetcode.editor.cn

object No0039CombinationSum {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
            val n = candidates.size

            val result = mutableListOf<List<Int>>()

            fun dfs(target: Int, counts: IntArray, begin: Int) {
                if (target < 0) return
                if (target == 0) {
                    result.add(element = buildList {
                        for (i in 0 until n) {
                            var count = counts[i]
                            while (count-- > 0) add(element = candidates[i])
                        }
                    })
                }

                for (i in begin until n) {
                    counts[i]++
                    dfs(target = target - candidates[i], counts = counts, begin = i)
                    counts[i]--
                }
            }

            dfs(target = target, counts = IntArray(size = n), begin = 0)

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}