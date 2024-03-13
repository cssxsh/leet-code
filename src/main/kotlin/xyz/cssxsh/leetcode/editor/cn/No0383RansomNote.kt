package xyz.cssxsh.leetcode.editor.cn

class No0383RansomNote {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun canConstruct(ransomNote: String, magazine: String): Boolean {
            val counts = IntArray(size = 26) { 0 }
            for (char in ransomNote) {
                counts[char - 'a']++
            }
            for (char in magazine) {
                counts[char - 'a']--
            }
            return counts.all { it <= 0 }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}