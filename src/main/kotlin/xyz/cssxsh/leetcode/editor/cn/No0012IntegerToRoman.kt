package xyz.cssxsh.leetcode.editor.cn

object No0012IntegerToRoman {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun intToRoman(num: Int): String {
            return buildString {
                var x = num
                append(M[x / 1000])
                x %= 1000
                append(C[x / 100])
                x %= 100
                append(X[x / 10])
                x %= 10
                append(I[x])
            }
        }

        companion object {
            @JvmStatic
            private val I = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

            @JvmStatic
            private val X = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")

            @JvmStatic
            private val C = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")

            @JvmStatic
            private val M = arrayOf("", "M", "MM", "MMM")
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}