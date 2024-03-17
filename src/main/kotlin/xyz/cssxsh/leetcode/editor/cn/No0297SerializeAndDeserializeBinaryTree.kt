package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*

object No0297SerializeAndDeserializeBinaryTree {
    @JvmStatic
    fun main(vararg args: String): Unit = runSolution<Solution>(args = args)

    class Solution {
        fun codec(root: TreeNode?): TreeNode? {
            val serializer = Codec()
            val data = serializer.serialize(root)
            val deserializer = Codec()
            return deserializer.deserialize(data)
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Codec {
        fun serialize(root: TreeNode?): String {
            val queue = ArrayDeque<TreeNode>()
            queue.addLast(element = root ?: return "[]")
            return buildString {
                append('[')
                append(root.`val`)
                while (queue.isEmpty().not()) {
                    val node = queue.removeFirst()
                    val left = node.left
                    if (left != null) {
                        append(',').append(left.`val`)
                        queue.addLast(element = left)
                    } else {
                        append(',').append(null as Int?)
                    }
                    val right = node.right
                    if (right != null) {
                        append(',').append(right.`val`)
                        queue.addLast(element = right)
                    } else {
                        append(',').append(null as Int?)
                    }
                }
                append(']')
            }
        }

        fun deserialize(data: String): TreeNode? {
            val iterator = data.asIntSequence().iterator()
            if (iterator.hasNext().not()) return null
            val root = TreeNode(iterator.next() ?: return null)

            val queue = ArrayDeque<TreeNode>()
            queue.addLast(element = root)

            while (queue.isEmpty().not()) {
                val node = queue.removeFirst()
                if (iterator.hasNext().not()) break
                val l = iterator.next()
                if (l != null) {
                    val left = TreeNode(l)
                    node.left = left
                    queue.addLast(element = left)
                }
                if (iterator.hasNext().not()) break
                val r = iterator.next()
                if (r != null) {
                    val right = TreeNode(r)
                    node.right = right
                    queue.addLast(element = right)
                }
            }

            return root
        }

        private fun String.asIntSequence(): Sequence<Int?> = sequence {
            var num = 0
            var sign = 1
            var wait = false
            for (char in this@asIntSequence) {
                when (char) {
                    'n' -> {
                        yield(value = null)
                        wait = false
                    }
                    in '0' .. '9' -> {
                        num = num * 10 + char.minus('0')
                        wait = true
                    }
                    '-' -> {
                        sign = -1
                        wait = true
                    }
                    ',' -> {
                        if (wait) yield(value = sign * num)
                        num = 0
                        sign = 1
                    }
                    ']' -> {
                        if (wait) yield(value = sign * num)
                    }
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}