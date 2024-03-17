package xyz.cssxsh.leetcode.editor.cn

object No0240SearchA2dMatrixIi {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            val m = matrix.size
            val n = matrix[0].size

            var y = 0
            var x = n - 1
            while (y < m && x >= 0) {
                // println("($x,$y)")
                if (matrix[y][x] == target) return true
                if (matrix[y][x] > target) x-- else y++
            }

            return false
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}