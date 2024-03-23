package xyz.cssxsh.leetcode.editor.cn

object No0074SearchA2dMatrix {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            val m = matrix.size
            val n = matrix[0].size

            var left = 0
            var right = m * n - 1
            while (left <= right) {
                val mid = (left + right) / 2
                val value = matrix[mid / n][mid % n]
                if (value == target) return true

                if (value < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }

            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}