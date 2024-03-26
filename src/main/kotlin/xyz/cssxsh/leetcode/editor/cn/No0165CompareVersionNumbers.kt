package xyz.cssxsh.leetcode.editor.cn

object No0165CompareVersionNumbers {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun compareVersion(version1: String, version2: String): Int {
            val m = version1.length
            val n = version2.length

            var i = 0
            var j = 0

            while (j < m || i < n) {
                var a = 0
                while (j < m && version1[j++] != '.') a = a * 10 + (version1[j - 1] - '0')

                var b = 0
                while (i < n && version2[i++] != '.') b = b * 10 + (version2[i - 1] - '0')

                if (a != b) return if (a > b) 1 else -1
            }

            return 0
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}