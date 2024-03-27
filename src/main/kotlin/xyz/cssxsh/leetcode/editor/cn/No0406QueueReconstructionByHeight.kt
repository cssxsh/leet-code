package xyz.cssxsh.leetcode.editor.cn

import java.util.*

object No0406QueueReconstructionByHeight {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
            val result = ArrayList<IntArray>(people.size)
            people.sortWith comparator@{ (hi, ki), (hj, kj) ->
                if (hi != hj) hj - hi else ki - kj
            }
            for (person in people) {
                result.add(index = person[1], element = person)
            }

            return result.toTypedArray()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}