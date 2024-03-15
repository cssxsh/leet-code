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
    println(classifier.qualifiedName)

    val method = classifier.members.find { it.visibility == KVisibility.PUBLIC }
        ?: throw IllegalArgumentException("not found method")
    val lines = args.ifEmpty { readExample(classifier = classifier) }

    for (offset in lines.indices step method.parameters.size - 1) {
        val values = method.parameters.associateWith { parameter ->
            if (parameter.kind == KParameter.Kind.INSTANCE) return@associateWith classifier.createInstance()
            val line = lines[offset + parameter.index - 1]
            when (parameter.type) {
                typeOf<String>() -> line.trim('"')
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
                typeOf<Array<String>>() -> line.trim('[', ']')
                    .splitToSequence(',')
                    .map { it.trim('"') }
                    .toList()
                    .toTypedArray()
                typeOf<Array<IntArray>>() -> line.trim('[', ']')
                    .splitToSequence("],[")
                    .map { it.splitToSequence(',').map(String::toInt).toList().toIntArray() }
                    .toList()
                    .toTypedArray()
                else -> throw IllegalArgumentException("unsupported $parameter")
            }
        }
        val result = method.callBy(args = values)
        println("---")
        when (result) {
            is String -> println('"' + result + '"')
            is Array<*> -> println(result.contentToString())
            is IntArray -> println(result.contentToString())
            is LongArray -> println(result.contentToString())
            is Unit -> when (val v = values[method.parameters[1]]) {
                is IntArray -> println(v.contentToString())
                is LongArray -> println(v.contentToString())
            }
            else -> println(result)
        }
    }

    println()
}

@PublishedApi
internal fun readExample(classifier: KClass<*>): Array<String> {
    val clazz = classifier.java.enclosingClass ?: classifier.java

    val url = clazz.getResource("${clazz.simpleName}.txt")
        ?: throw IllegalArgumentException("not found ${clazz.simpleName}.txt")

    println("---")
    println("read $url")

    return url.openStream().use { it.bufferedReader().readLines().toTypedArray() }
}