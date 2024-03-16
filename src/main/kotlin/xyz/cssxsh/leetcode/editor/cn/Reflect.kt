package xyz.cssxsh.leetcode.editor.cn

import xyz.cssxsh.leetcode.editor.cn.data.*
import kotlin.reflect.*
import kotlin.reflect.full.*

private fun KParameter.parse(line: String): Any? {
    return when (type) {
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
        typeOf<ListNode>(), typeOf<ListNode?>() -> line.trim('[', ']')
            .splitToSequence(',')
            .filter { it.isNotEmpty() }
            .map { it.toInt() }
            .toListNode()
        typeOf<TreeNode>(), typeOf<TreeNode?>() -> line.trim('[', ']')
            .splitToSequence(',')
            .map { it.toIntOrNull() }
            .toTreeNode()
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
        .maxByOrNull { it.parameters.size }
        ?: throw IllegalArgumentException("not found method")
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

    lateinit var instance: Any


    val lines = args.ifEmpty { readExample(classifier = classifier) }

    val commands = lines[0].trim('[', ']')
        .splitToSequence(',')
        .map { it.trim('"') }

    val parameters = lines[1].trim('[', ']')
        .splitToSequence(',')
        .map { it.trim('[', ']').splitToSequence(',').toList() }

    for ((command, array) in commands zip parameters) {
        if (command == classifier.simpleName) {
            instance = classifier.createInstance()
            continue
        }
        val method = classifier.members.find { it.name == command }
            ?: throw IllegalArgumentException("not found method $command")

        val values = method.parameters.associateWith { parameter ->
            if (parameter.kind == KParameter.Kind.INSTANCE) return@associateWith instance
            parameter.parse(line = array[parameter.index - 1])
        }
        val result = method.callBy(args = values)
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