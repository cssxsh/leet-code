package xyz.cssxsh.leetcode.editor.cn

object No2129CapitalizeTheTitle {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun capitalizeTitle(title: String): String {
            return buildString(capacity = title.length) {
                var p = 0
                var l = 0
                title.forEachIndexed { i, char ->
                    if (char == ' ') {
                        if (l > 2) {
                            val f = get(p)
                            deleteCharAt(p)
                            insert(p, f.uppercase())
                        }
                        l = 0
                        p = i + 1
                    } else {
                        l++
                    }
                    append(char.lowercase())
                }

                if (l > 2) {
                    val f = get(p)
                    deleteCharAt(p)
                    insert(p, f.uppercase())
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}