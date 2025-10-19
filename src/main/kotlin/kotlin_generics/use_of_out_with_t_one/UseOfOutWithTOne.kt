package kotlin_generics.use_of_out_with_t_one

import basics.printItems

class MyClass<T>(text: T){
    var name = text
}

class Company<T>(name: T) {
    var companyName = name
}

fun main() {
//    val my1 = MyClass("hmsmurtaza")

    val c = Company(123)
    val c1 = Company("hmsmurtaza")
    println(c.companyName)
    println(c1.companyName)
}
