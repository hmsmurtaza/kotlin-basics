package basics

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun mul(a: Int, b: Int): Int =  a * b

fun printMul(a: Int, b: Int) {
    println(mul(a, b))
}

fun printlnMul1(a: Int = 1, b: Int) {
    println(mul(a, b))
}

fun printMul2(a: Int, b: Int = 1) = println(mul(a, b))

