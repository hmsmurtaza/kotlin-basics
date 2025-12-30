package kotlin_generics.generic_classes

class SophisticatedBox<T>(var item: T)
        where T : Number, T : Comparable<T> {
    fun isGreaterThan(other: T): Boolean {
        return item > other
    }
}

fun main() {
    println(SophisticatedBox(4).isGreaterThan(6))
}