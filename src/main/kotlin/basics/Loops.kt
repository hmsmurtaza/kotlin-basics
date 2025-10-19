package basics

fun printItems(items: List<String>) {
    for (item in items) {
        println(item)
    }
}

fun printItemWithIndex(items: List<String>) {
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun printItemWithIndex1(items: List<String>) {
    for ((index, item) in items.withIndex()) {
        println("item at $index is $item")
    }
}

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")

    printItems(items = items)
    printItemWithIndex(items = items)
    printItemWithIndex1(items = items)
}