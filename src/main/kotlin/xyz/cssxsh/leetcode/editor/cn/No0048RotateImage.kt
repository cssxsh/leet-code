package xyz.cssxsh.leetcode.editor.cn

object No0048RotateImage {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun rotate(matrix: Array<IntArray>) {
            val n = matrix.size

            for (i in 0 until n / 2) {
                val j = n - 1 - i

                for (offset in 0 until n - 2 * i - 1) {
                    val a = matrix[i][i + offset]
                    val b = matrix[i + offset][j]
                    val c = matrix[j - offset][i]
                    val d = matrix[j][j - offset]

                    matrix[i][i + offset] = c
                    matrix[i + offset][j] = a
                    matrix[j - offset][i] = d
                    matrix[j][j - offset] = b
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}