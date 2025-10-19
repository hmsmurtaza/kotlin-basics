package kotlin_generics

fun main() {
    var ageInt: Car<Int> = Car(1984)
    var ageString: Car<String> = Car("1984")
}

class Car<T>(year: T) {
    var year: T = year
    init {
        this.year = year
        println(year)
    }
}