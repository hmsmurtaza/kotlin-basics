package generics_with_upper_bound

class Calculator<T : Number>(val value: T){
    fun toDouble(): Double {
        return value.toDouble()
    }

    override fun toString(): String {
        return value.toString()
    }
}

fun main() {
    val intCalculator = Calculator(10)
    println("Before double: $intCalculator")
    println("After double: ${intCalculator.toDouble()}")

    val doubleCalculator = Calculator(5.5)
    println("Before double: ${doubleCalculator.toString()}")
    println("After double: ${doubleCalculator.toDouble()}")
}