package xyz.cssxsh.leetcode.editor.cn

object No0070ClimbingStairs {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun climbStairs(n: Int): Int {
            var a = 1
            var b = 0
            var i = 0
            while (i < n) {
                val sum = a + b
                b = a
                a = sum
                i++
            }

            return a
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}