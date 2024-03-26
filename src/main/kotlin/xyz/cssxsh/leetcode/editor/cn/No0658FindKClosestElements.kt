package xyz.cssxsh.leetcode.editor.cn

object No0658FindKClosestElements {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
            val n = arr.size
            if (k == n) return arr.asList()
            if (x <= arr[0]) return arr.slice(0 until k)
            if (x >= arr[n - 1]) return arr.slice(n - k until n)

            var left = 0
            var right = n - 1
            while (left <= right) {
                val mid = (left + right) / 2
                val value = arr[mid]
                if (value == x) {
                    left = mid
                    right = mid - 1
                    break
                }

                if (value < x) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }

            var i = right
            var j = left
            while (j - i - 1 < k) {
                if (x - arr[i] <= arr[j] - x) {
                    i--
                } else {
                    j++
                }

                if (i == -1) {
                    return arr.slice(0 until k)
                }
                if (j == n) {
                    return arr.slice(n - k until n)
                }
            }
            i++
            j--

            return arr.slice(i .. j)
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}