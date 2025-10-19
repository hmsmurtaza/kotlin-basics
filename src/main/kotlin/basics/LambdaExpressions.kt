package basics

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val subtract: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
val multiply: (Int, Int) -> Int = { x: Int, y: Int -> x * y }

/**
 * According to Kotlin convention, last parameter of a function is lambda expression,
 * then a lambda expression passed as an argument can be placed outside the parenthesis.
 */

val items = listOf("apple", "banana", "kiwifruit")
/*val badProduct = items.fold(1, { acc: Any, e: String -> acc * e })
val goodProduct  = items.fold(1) { acc: Any, e: String -> acc * e }*/

fun main() {
    println(sum(2, 3))
    println(subtract(3, 2))
    println(multiply(3, 3))
    /**
     * If the lambda expression is the only argument, the parenthesis can be omitted entirely (the documentation
     * call this feature "trailing lambda as a parameter".
     */
    run({ println("Not cool") })
    run { println("Very cool") }
}