package xyz.cssxsh.leetcode.editor.cn

object No0303RangeSumQueryImmutable {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<NumArray>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray(nums: IntArray) {
        private val sums = IntArray(size = nums.size + 1)

        init {
            for (index in nums.indices) sums[index + 1] = sums[index] + nums[index]
        }

        fun sumRange(left: Int, right: Int): Int {
            return sums[right + 1] - sums[left]
        }

        override fun toString(): String {
            return buildString {
                append("NumArray(")
                append("sums=")
                sums.joinTo(buffer = this, prefix = "[", postfix = "]")
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}