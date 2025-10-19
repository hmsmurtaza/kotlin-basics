package kotlin_generics.type_safety_in_generics

/**
 * Without type-safety
 */
/*class Box<T>{
    private val value: T? = null

    fun getValue(): T? = value

    fun setValue(value: T) {
        // No type checking
    }
}

fun main() {
    val stringBox: Box<String> = Box()

    val anyBox: Box<Any> = stringBox    // No type safety

    anyBox.setValue(123)    // No compile-time error

    val stringValue: String = stringBox.getValue()!!  // Runtime error: ClassCastException
}*/

/**
 * With type-safety
 */
class Box<out T>{
    private val value: T? = null

    fun getValue(): T? = value

    // No setValue function due to out keyword
}

fun main() {
    val stringBox: Box<String> = Box()
    val anyBox: Box<Any> = stringBox    // Works because of covariance

//    anyBox.setValue(123)  compile-time error: no setter is available

    val stringValue: String = stringBox.getValue()!!    // Type safety ensured
    println(stringValue)
}