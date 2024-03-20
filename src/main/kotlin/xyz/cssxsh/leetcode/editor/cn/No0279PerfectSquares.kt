package xyz.cssxsh.leetcode.editor.cn

object No0279PerfectSquares {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun numSquares(n: Int): Int {
            // n = a ^ 2 + b ^ 2 + c ^ 2 + d ^ 2
            // n = (4 ^ k)(8m + 7)
            if (n.isSquare()) return 1
            if (n.isAnswer4()) return 4
            if (n.isAnswer2()) return 2
            return 3
        }

        private fun Int.isSquare(): Boolean {
            var i = 1
            while (true) {
                val s = i * i
                if (s > this) break
                if (s == this) return true
                i++
            }
            return false
        }

        private fun Int.isAnswer2(): Boolean {
            var i = 1
            while (true) {
                val s = i * i
                if (s >= this) break
                val j = this - s
                if (j.isSquare()) return true
                i++
            }
            return false
        }

        private fun Int.isAnswer4(): Boolean {
            var x = this
            while (x and 3 == 0) x = x shr 2
            return x and 7 == 7
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}