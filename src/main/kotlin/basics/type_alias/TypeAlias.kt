package basics.type_alias

typealias Predicate<T> = (T) -> Boolean

fun foo(f: Predicate<Int>) = f(42)

fun main() {
    println(foo { it > 0 })
//    println(foo({it > 0}))    // Used with short lambda expression
}