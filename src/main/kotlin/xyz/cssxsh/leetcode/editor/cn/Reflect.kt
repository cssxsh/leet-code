package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*
import kotlin.reflect.*
import kotlin.reflect.full.*

@PublishedApi
internal fun String.parts(vararg delimiters: Char = charArrayOf(',')): Sequence<String> {
    return sequence {
        var start = 1
        var index = 0
        var text = false
        var part = -1
        while (index < length) {
            when (get(index = index++)) {
                '"' -> {
                    text = !text
                }
                '[' -> {
                    if (text) continue
                    part++
                }
                ']' -> {
                    if (text) continue
                    part--
                }
                in delimiters -> {
                    if (text) continue
                    if (part != 0) continue
                    yield(value = substring(startIndex = start, endIndex = index - 1))
                    start = index
                }
            }
        }
        if (start < index - 1) yield(value = substring(startIndex = start, endIndex = index - 1))
    }
}

private fun KParameter.parse(line: String): Any? {
    return when (type) {
        typeOf<String>() -> line.trim('"')
        typeOf<Int>() -> line.toInt()
        typeOf<Long>() -> line.toLong()
        typeOf<IntArray>() -> line.parts()
            .map { it.toInt() }
            .toList()
            .toIntArray()
        typeOf<LongArray>() -> line.parts()
            .map { it.toLong() }
            .toList()
            .toLongArray()
        typeOf<ListNode>(), typeOf<ListNode?>() -> line.parts()
            .map { it.toInt() }
            .toListNode()
        typeOf<TreeNode>(), typeOf<TreeNode?>() -> line.parts()
            .map { it.toIntOrNull() }
            .toTreeNode()
        typeOf<Array<String>>() -> line.parts()
            .map { it.trim('"') }
            .toList()
            .toTypedArray()
        typeOf<Array<IntArray>>() -> line.parts()
            .map { it.parts().map(String::toInt).toList().toIntArray() }
            .toList()
            .toTypedArray()
        else -> throw IllegalArgumentException("unsupported $this")
    }
}

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

    val method = classifier.members.filter { it.visibility == KVisibility.PUBLIC }
        .maxByOrNull { it.parameters.size } ?: throw IllegalArgumentException("not found method")
    val lines = args.ifEmpty { readExample(classifier = classifier) }

    for (offset in lines.indices step method.parameters.size - 1) {
        val values = method.parameters.associateWith { parameter ->
            if (parameter.kind == KParameter.Kind.INSTANCE) return@associateWith classifier.createInstance()
            parameter.parse(line = lines[offset + parameter.index - 1])
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

@PublishedApi
internal inline fun <reified T : Any> runInstance(vararg args: String) {
    runSolution(classifier = typeOf<T>().classifier as KClass<*>, args = args)
}

@PublishedApi
internal fun runInstance(classifier: KClass<*>, vararg args: String) {
    println(classifier.qualifiedName)

    var instance: Any? = null

    val lines = args.ifEmpty { readExample(classifier = classifier) }

    val commands = lines[0].parts()
        .map { it.trim('"') }

    val parameters = lines[1].parts()
        .map { it.parts() }

    for ((command, parts) in commands zip parameters) {
        val method = classifier.members.find { it.name == command }
            ?: classifier.constructors.find { classifier.simpleName == command }
            ?: throw IllegalArgumentException("not found method $command")
        val iterator = parts.iterator()

        val values = method.parameters.associateWith { parameter ->
            if (parameter.kind == KParameter.Kind.INSTANCE) return@associateWith instance
            parameter.parse(line = iterator.next())
        }
        val result = method.callBy(args = values)

        if (command == classifier.simpleName) {
            instance = result!!
            continue
        }

        println("---")
        println("command: $command")
        when (result) {
            is String -> println('"' + result + '"')
            is Array<*> -> println(result.contentToString())
            is IntArray -> println(result.contentToString())
            is LongArray -> println(result.contentToString())
            else -> println(result)
        }
    }

    println()
}