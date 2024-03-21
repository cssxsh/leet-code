package xyz.cssxsh.leetcode.editor.cn

object No2671FrequencyTracker {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<FrequencyTracker>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class FrequencyTracker {

        private val numbers = IntArray(size = 1000001)

        private val frequencies = IntArray(size = 1000001)

        fun add(number: Int) {
            frequencies[numbers[number]]--
            numbers[number]++
            frequencies[numbers[number]]++
        }

        fun deleteOne(number: Int) {
            if (numbers[number] == 0) return
            frequencies[numbers[number]]--
            numbers[number]--
            frequencies[numbers[number]]++
        }

        fun hasFrequency(frequency: Int): Boolean {
            return frequencies[frequency] != 0
        }

        override fun toString(): String {
            val sequence = sequence {
                for (number in 1 .. 100000) {
                    for (i in 0 until numbers[number]) {
                        yield(value = number)
                    }
                }
            }
            return buildString {
                append("FrequencyTracker(")
                append("numbers=")
                sequence.joinTo(buffer = this, prefix = "[", postfix = "]")
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}