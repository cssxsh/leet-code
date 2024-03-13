package xyz.cssxsh.leetcode.editor.cn

object No0412FizzBuzz {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun fizzBuzz(n: Int): List<String> {
            var fb = 15
            var f = 3
            var b = 5
            return MutableList(size = n) { index ->
                when (index + 1) {
                    fb -> {
                        fb += 15
                        f += 3
                        b += 5
                        "FizzBuzz"
                    }
                    f -> {
                        f += 3
                        "Fizz"
                    }
                    b -> {
                        b += 5
                        "Buzz"
                    }
                    else -> {
                        (index + 1).toString()
                    }
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}