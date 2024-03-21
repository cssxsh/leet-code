package xyz.cssxsh.leetcode.editor.cn

object No0155MinStack {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<MinStack>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {

        private val array = IntArray(size = 30_000)

        private val min = IntArray(size = 30_000)

        private var i = -1

        fun push(`val`: Int) {
            array[++i] = `val`
            min[i] = if (i > 0) minOf(`val`, min[i - 1]) else `val`
        }

        fun pop() {
            i--
        }

        fun top(): Int {
            return array[i]
        }

        fun getMin(): Int {
            return min[i]
        }

        override fun toString(): String {
            return buildString {
                append("MinStack(")
                append("array=")
                (0 .. i).joinTo(buffer = this, prefix = "[", postfix = "]") { array[it].toString() }
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}