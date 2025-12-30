package kotlin_generics.generic_classes

class RealWorldExampleBoxCovariant<out T>(val item: T)

fun <T> RealWorldExampleBoxCovariant<T>.printBox() {
    println("Box contains: $item (Type: ${item?.let { it::class.simpleName } ?: "null"})")
}

fun main() {
    val stringRealWorldExampleBoxCovariant: RealWorldExampleBoxCovariant<String> =
        RealWorldExampleBoxCovariant("Assalamu-Alaikum")
    val anyRealWorldExampleBoxCovariant: RealWorldExampleBoxCovariant<Any> =
        RealWorldExampleBoxCovariant(42)

    stringRealWorldExampleBoxCovariant.printBox()
    anyRealWorldExampleBoxCovariant.printBox()
}