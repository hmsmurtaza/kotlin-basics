package kotlin_generics.generic_classes

class Pair<K, V, W>(val key: K, val value: V, val anotherValue: W) {
    fun printAllValues() {
        println("$key is mapped to $value and third value is $anotherValue")
    }
}

fun main() {
    val multipleValues = Pair(5, "hello world", 4.5)
    multipleValues.printAllValues()
}