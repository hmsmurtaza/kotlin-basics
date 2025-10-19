package basics

import kotlin.math.max

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// is the same as

fun maxOf1(a: Int, b: Int) =       // if can be an expression, (it can return)
    if (a > b) {
        a
    } else {
        b
    }

// Can be a one-liner

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(maxOf(8, 3))
    println(maxOf1(3, 4))
    println(maxOf2(1, 4))
}