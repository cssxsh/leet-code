package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0373FindKPairsWithSmallestSums {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
            if (k == 1) return listOf(listOf(nums1[0], nums2[0]))
            val m = nums1.size
            val n = nums2.size
            if (k == m * n) {
                return buildList(capacity = k) {
                    for (u in nums1) {
                        for (v in nums2) {
                            add(element = listOf(u, v))
                        }
                    }
                }
            }

            val result = ArrayList<List<Int>>(k)

            val queue = PriorityQueue<Pair<Int, Int>>(k) { (u1, v1), (u2, v2) ->
                nums1[u1] + nums2[v1] - nums1[u2] - nums2[v2]
            }

            for (i in 0 until minOf(m, k)) queue.add(element = i to 0)

            var i = k
            while (i-- > 0 && queue.isEmpty().not()) {
                val (u, v) = queue.poll()
                result.add(element = listOf(nums1[u], nums2[v]))
                if (v + 1 < n) queue.offer(u to v + 1)
            }

            return result
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}