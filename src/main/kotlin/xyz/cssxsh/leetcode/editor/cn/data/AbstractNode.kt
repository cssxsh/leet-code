package xyz.cssxsh.leetcode.editor.cn.data

abstract class AbstractNode<T, N : AbstractNode<T, N>> : Sequence<T> {

    abstract val `val`: T

    abstract fun children(): Sequence<N?>

    override fun toString(): String = joinToString(separator = ",", prefix = "[", postfix = "]")

    override fun equals(other: Any?): Boolean {
        val p = iterator()
        val q = when (other) {
            is Iterable<*> -> other.iterator()
            is Sequence<*> -> other.iterator()
            is Array<*> -> other.iterator()
            is IntArray -> other.iterator()
            else -> return false
        }

        while (p.hasNext() && q.hasNext()) {
            if (p.next() != q.next()) return false
        }
        return p.hasNext() == q.hasNext()
    }

    override fun hashCode(): Int = toList().hashCode()
}