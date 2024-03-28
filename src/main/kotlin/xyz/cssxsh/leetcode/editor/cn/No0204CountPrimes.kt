package xyz.cssxsh.leetcode.editor.cn

object No0204CountPrimes {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * [筛法](https://oi-wiki.org/math/number-theory/sieve/)
         */
        fun countPrimes(n: Int): Int {
            val primes = ArrayList<Int>()
            val isPrime = BooleanArray(size = n) { true }

            for (i in 2 until n) {
                if (isPrime[i]) primes.add(element = i)
                for (prime in primes) {
                    if (i * prime >= n) break
                    isPrime[i * prime] = false
                    if (i % prime == 0) break
                }
            }

            return primes.size
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}