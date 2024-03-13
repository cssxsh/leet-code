package xyz.cssxsh.leetcode.editor.cn

object No1672RichestCustomerWealth {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun maximumWealth(accounts: Array<IntArray>): Int {
            val sums = IntArray(size = accounts.size) { 0 }
            accounts.forEachIndexed { i, account ->
                sums[i] = account.sum()
            }
            return sums.max()
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}