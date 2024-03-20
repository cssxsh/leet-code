package xyz.cssxsh.leetcode.editor.cn

object No0189RotateArray {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun rotate(nums: IntArray, k: Int) {
            val n = nums.size
            if (n == 1) return
            val m = k % n
            if (m == 0) return

            var count = 0
            for (offset in 0 until m) {
                var i = offset
                val last = nums[n - m + offset]
                var temp = nums[offset]

                while (true) {
                    val next = (i + m) % n

                    val a = nums[next]
                    nums[next] = temp
                    temp = a

                    count++
                    if (next == offset) break
                    i = next
                }
                nums[offset] = last

                if (count >= n) break
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}