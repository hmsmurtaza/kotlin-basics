package kotlin_generics.generic_classes

// Invariance i.e Without out keyword
class BoxInvariant<T>(val item: T)

fun main() {
    val stringBoxInvariant: BoxInvariant<String> = BoxInvariant("Assalamu-Alaikum")

    // Initializer type mismatch: expected type is BoxInvariant<Any>, actual type is BoxInvariant<String>
    // val anyBoxInvariant: BoxInvariant<Any> = stringBoxInvariant
}
