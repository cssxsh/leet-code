package xyz.cssxsh.leetcode.editor.cn

object No0365WaterAndJugProblem {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [裴蜀定理](https://oi-wiki.org/math/number-theory/bezouts/)
         */
        fun canMeasureWater(x: Int, y: Int, target: Int): Boolean {
            if (x + y < target) return false
            if (x + y == target) return true
            return target % gcd(a = x, b = y) == 0
        }

        private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(a = b, b = a % b)
    }
    //leetcode submit region end(Prohibit modification and deletion)
}