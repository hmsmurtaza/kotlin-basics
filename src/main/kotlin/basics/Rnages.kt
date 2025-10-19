package basics

fun printUsingRange() {
    val x = 10
    if (x in 1..10) {
        println("fits in range")
    } else {
        println("not fits in the range")
    }
    println()
}

fun printUsingRange1() {
    for (x in 1..5) {
        print(x)
    }
    println()
}

fun printUsingDownToAndStep() {
    for (x in 9 downTo 1 step 1) {
        print(x)
    }
    println()
}

fun main() {
    printUsingRange()
    printUsingRange1()
    printUsingDownToAndStep()
}