package xyz.cssxsh.leetcode.editor.cn

object No0073SetMatrixZeroes {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun setZeroes(matrix: Array<IntArray>) {
            val m = matrix.size
            val n = matrix[0].size
            var flag = false

            for (j in 0 until m) {
                if (matrix[j][0] == 0) flag = true
                for (i in 1 until n) {
                    if (matrix[j][i] == 0) {
                        matrix[j][0] = 0
                        matrix[0][i] = 0
                    }
                }
            }
            for (j in (0 until m).reversed()) {
                for (i in 1 until n) {
                    if (matrix[j][0] == 0 || matrix[0][i] == 0) {
                        matrix[j][i] = 0
                    }
                }
                if (flag) matrix[j][0] = 0
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}