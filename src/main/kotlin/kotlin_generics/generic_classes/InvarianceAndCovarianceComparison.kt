package kotlin_generics.generic_classes

// Invariance i.e Without 'out' keyword
class BoxInvariant<T>(val item: T)

class BoxCovariant<out T>(val item: T)  // If we add 'out' keyword

fun main() {
    //**************************** Invariant, without 'out' keyword *************************
    val stringBoxInvariant: BoxInvariant<String> = BoxInvariant("Assalamu-Alaikum")

    // Initializer type mismatch: expected type is BoxInvariant<Any>, actual type is BoxInvariant<String>
    // val anyBoxInvariant: BoxInvariant<Any> = stringBoxInvariant
    //****************************************************************************************

    //**************************** Covariant, with 'out' keyword *****************************
    val stringBoxCovariant: BoxCovariant<String> = BoxCovariant("Walaikum-Slam")
    // SUCCESS: This works perfectly!
    val anyBoxCovariant: BoxCovariant<Any> = stringBoxCovariant
}