package xyz.cssxsh.leetcode.editor.cn

object No0054SpiralMatrix {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun spiralOrder(matrix: Array<IntArray>): List<Int> {
            val m = matrix.size
            val n = matrix[0].size
            if (m == 1) return matrix[0].asList()
            if (n == 1) return matrix.map { it[0] }
            val capacity = m * n

            return buildList(capacity = capacity) {
                var left = 0
                var right = n - 1
                var top = 0
                var bottom = m - 1

                while (left < right && top < bottom) {
                    for (i in left until right) add(element = matrix[top][i])
                    for (j in top until bottom) add(element = matrix[j][right])
                    for (i in right downTo left + 1) add(element = matrix[bottom][i])
                    for (j in bottom downTo top + 1) add(element = matrix[j][left])

                    left++
                    right--
                    top++
                    bottom--
                }

                if (top == bottom) {
                    for (i in left .. right) add(element = matrix[top][i])
                } else if (left == right) {
                    for (j in top .. bottom) add(element = matrix[j][left])
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}