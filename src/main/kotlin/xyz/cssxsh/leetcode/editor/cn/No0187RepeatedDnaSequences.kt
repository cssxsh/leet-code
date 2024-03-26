package xyz.cssxsh.leetcode.editor.cn

object No0187RepeatedDnaSequences {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findRepeatedDnaSequences(s: String): List<String> {
            val n = s.length
            if (n < 10) return emptyList()


            var bits = 0
            for (i in 0 until 10) {
                bits = bits shl 2 or s[i].asACGT()
            }
            val record = hashMapOf(bits to 1)
            val result = mutableListOf<String>()

            for (i in 10 until n) {
                bits = bits shl 2 or s[i].asACGT() and 0b1111_11111111_11111111
                val prev = record[bits] ?: 0
                if (prev == 1) {
                    val chars = CharArray(size = 10) {
                        when (bits shr 18.minus(it * 2) and 0b11) {
                            0b00 -> 'A'
                            0b01 -> 'C'
                            0b10 -> 'G'
                            0b11 -> 'T'
                            else -> '?'
                        }
                    }
                    result.add(element = chars.concatToString())
                }
                record[bits] = prev + 1
            }

            return result
        }

        private fun Char.asACGT(): Int {
            return when (this) {
                'A' -> 0b00
                'C' -> 0b01
                'G' -> 0b10
                'T' -> 0b11
                else -> throw IllegalArgumentException("type '$this'")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}