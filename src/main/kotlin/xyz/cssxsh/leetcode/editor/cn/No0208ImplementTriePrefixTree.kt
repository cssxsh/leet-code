package xyz.cssxsh.leetcode.editor.cn

object No0208ImplementTriePrefixTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<Trie>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Trie {
        private val children = Array<Trie?>(size = 'z' - 'a' + 1) { null }
        private var end = false

        fun insert(word: String) {
            var node = this
            for (char in word) {
                val index = char - 'a'
                node = node.children[index] ?: Trie().also { node.children[index] = it }
            }
            node.end = true
        }

        fun search(word: String): Boolean {
            val node = searchPrefix(prefix = word)
            return node != null && node.end
        }

        fun startsWith(prefix: String): Boolean {
            return searchPrefix(prefix = prefix) != null
        }

        private fun searchPrefix(prefix: String): Trie? {
            var node = this
            for (char in prefix) {
                val index = char - 'a'
                node = node.children[index] ?: return null
            }
            return node
        }

        override fun toString(): String {
            val words = ArrayList<String>()
            val buffer = StringBuilder()

            fun push(node: Trie) {
                if (node.end) words.add(element = buffer.toString())

                for (char in 'a' .. 'z') {
                    val index = char - 'a'
                    val child = node.children[index] ?: continue
                    buffer.append(char)
                    push(node = child)
                    buffer.deleteCharAt(buffer.length - 1)
                }
            }

            push(node = this)

            return buildString {
                append("Trie(")
                append("words=")
                words.joinTo(buffer = this, prefix = "[", postfix = "]")
                append(")")
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}