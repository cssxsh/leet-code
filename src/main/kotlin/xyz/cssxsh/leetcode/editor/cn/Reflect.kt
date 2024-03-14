package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*
import kotlin.reflect.*
import kotlin.reflect.full.*

@PublishedApi
internal inline fun <reified T : Any> runSolution(vararg args: String) {
    runSolution(classifier = typeOf<T>().classifier as KClass<*>, args = args)
}

@PublishedApi
internal fun runSolution(classifier: KClass<*>, vararg args: String) {
    if (classifier.simpleName != "Solution") {
        val nested = classifier.nestedClasses.find { it.simpleName == "Solution" }
            ?: throw IllegalArgumentException("$classifier is not Solution")
        runSolution(classifier = nested, args = args)
        return
    }

    val method = classifier.members.find { it.visibility == KVisibility.PUBLIC }
        ?: throw IllegalArgumentException("not found method")
    val lines = args.ifEmpty { readExample(classifier = classifier) }

    for (offset in lines.indices step method.parameters.size - 1) {
        val result = method.callBy(args = method.parameters.associateWith { parameter ->
            if (parameter.kind == KParameter.Kind.INSTANCE) return@associateWith classifier.createInstance()
            val line = lines[offset + parameter.index - 1]
            when (parameter.type) {
                typeOf<String>() -> line
                typeOf<Int>() -> line.toInt()
                typeOf<Long>() -> line.toLong()
                typeOf<IntArray>() -> line.trim('[', ']')
                    .splitToSequence(',')
                    .map { it.toInt() }
                    .toList()
                    .toIntArray()
                typeOf<LongArray>() -> line.trim('[', ']')
                    .splitToSequence(',')
                    .map { it.toLong() }
                    .toList()
                    .toLongArray()
                typeOf<ListNode>() -> {
                    val root = ListNode(0)
                    line.trim('[', ']')
                        .splitToSequence(',')
                        .fold(initial = root) { prev, v -> ListNode(v.toInt()).also { prev.next = it } }
                    root.next
                }
                else -> throw IllegalArgumentException("unsupported $parameter")
            }
        })
        when (result) {
            is IntArray -> println(result.contentToString())
            is LongArray -> println(result.contentToString())
            is ListNode -> println(buildString {
                var node = result as ListNode?
                append('[')
                append(node!!.`val`)
                node = node.next
                while (node != null) {
                    append(',')
                    append(node.`val`)
                    node = node.next
                }
                append(']')
            })
            else -> println(result)
        }
    }
}

@PublishedApi
internal fun readExample(classifier: KClass<*>): Array<String> {
    val clazz = classifier.java
    val name = clazz.name.substringBefore('$').substringAfterLast('.')
    val url = clazz.getResource("$name.txt")
        ?: throw IllegalArgumentException("not found $name.txt")

    return url.openStream().use { it.bufferedReader().readLines().toTypedArray() }
}