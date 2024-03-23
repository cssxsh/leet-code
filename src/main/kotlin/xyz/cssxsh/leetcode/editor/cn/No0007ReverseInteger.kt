package xyz.cssxsh.leetcode.editor.cn

object No0007ReverseInteger {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun reverse(x: Int): Int {
            if (x == 0) return 0
            if (x == Int.MIN_VALUE) return 0
            val stack = ArrayDeque<Int>()

            var (sign, num) = if (x < 0) -1 to -x else 1 to x
            while (num != 0) {
                stack.addLast(element = num % 10)
                num /= 10
            }
            // 2147483647
            // 1563847412
            val limit = Int.MAX_VALUE / 10
            while (stack.isEmpty().not()) {
                if (num > limit) return 0
                num *= 10
                num += stack.removeFirst()
            }

            return num * sign
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}