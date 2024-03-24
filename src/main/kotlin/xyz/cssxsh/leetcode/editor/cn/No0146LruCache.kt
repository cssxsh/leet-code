package xyz.cssxsh.leetcode.editor.cn

object No0146LruCache {
    @JvmStatic
    fun main(vararg args: String): Unit = runInstance<LRUCache>(args = args)

    //leetcode submit region begin(Prohibit modification and deletion)
    class LRUCache(private val capacity: Int) {
        private var size = 0
        private val head = Node()
        private val tail = Node()
        private val cache = HashMap<Int, Node>()

        init {
            head.next = tail
            tail.prev = head
        }

        fun get(key: Int): Int {
            val node = cache.get(key = key) ?: return -1
            remove(node = node)
            add(node = node)
            return node.value
        }

        fun put(key: Int, value: Int) {
            val node = cache.get(key = key)
            if (node == null) {
                val new = Node(key = key, value = value)
                cache[key] = new
                add(node = new)
                size++
                if (size > capacity) {
                    val old = tail.prev
                    remove(node = old)
                    cache.remove(key = old.key)
                    size--
                }
            } else {
                node.value = value
                remove(node = node)
                add(node = node)
            }
        }

        private fun add(node: Node) {
            node.prev = head
            node.next = head.next
            head.next.prev = node
            head.next = node
        }

        private fun remove(node: Node) {
            node.prev.next = node.next
            node.next.prev = node.prev
        }

        override fun toString(): String {
            return buildString {
                append("LRUCache(")
                append("cache=")
                cache.values.joinTo(buffer = this, prefix = "{", postfix = "}") { node ->
                    "${node.key}=${node.value}"
                }
                append(")")
            }
        }
    }

    private class Node(val key: Int = 0, var value: Int = 0) {
        lateinit var prev: Node
        lateinit var next: Node
    }
    //leetcode submit region end(Prohibit modification and deletion)
}