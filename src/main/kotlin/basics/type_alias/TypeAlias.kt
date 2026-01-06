package basics.type_alias

typealias Predicate<T> = (Int) -> Boolean

fun foo(f: Predicate<Int>) = f(42)

fun main() {
    println(foo { it > 0 })
}