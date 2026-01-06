package basics.type_alias

typealias Predicate2<T> = (T) -> Boolean

fun foo2(p: Predicate2<Int>) = p(24)

fun main() {
    val f: (Int) -> Boolean = { it > 0}
    println(foo2(f))

    val p: Predicate2<Int> = { it % 2 == 0 }
    println(foo2(p))
}