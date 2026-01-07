package basics.type_alias

typealias Predicate<T> = (T) -> Boolean
fun foo(f: Predicate<Int>) = f(42)

/**
 * Following is the syntax if we don't use typealias keyword, and use/ provide type
 * of the argument on runtime
 */
fun <K> foo1(f1: (K) -> Boolean) = f1(32 as K)

fun main() {
    println("With typealis keyword: ${foo { it > 0 }}")
//    println(foo({it > 0}))    // Used with short lambda expression
    /**
     * Calling following method if we don't use typealias keyword
     */
    println("Without typealias keyword: ${foo1<Int> { it > 10 }}")
}