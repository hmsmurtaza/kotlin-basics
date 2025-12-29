package kotlin_generics.generic_classes

fun main() {
    val ageInt: Car<Int> = Car(1984)
    val ageString: Car<String> = Car("1984")
}

class Car<T>(year: T) {
    var year: T = year
    init {
        this.year = year
        println(year)
    }
}