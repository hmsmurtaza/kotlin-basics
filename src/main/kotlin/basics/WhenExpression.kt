package basics

fun max(a: Int, b: Int) {
    when (a) {
        a -> print("a == $a")
        b -> print("b == $b")
        else -> {
            print("a is neither 1 nor 2")
        }
    }
}

fun max1(a: Int, b: Int) =
    when {
        a < b -> print("a < b")
        a > b -> print("a > b")
        else -> {
            print("a == b")
        }
    }


fun main() {
    println(max(9, 4))
    println(max1(3, 4))
}