package kotlin_generics

fun main() {
    val returnedValue = setIntegerValue(1985)
    println("Returned value: $returnedValue")
    val returnedValue1 = setIntegerValue("1986")
    println("Returned value: $returnedValue1")
}

fun <T> setIntegerValue(value: T): T {
    println("Entered value: " + value)
    return value
}