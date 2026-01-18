package basics.oop.val_or_var_keywords

class MyClass<T>(data: T?)
class MyClass2<T: Any>(val data2: T?)   // By default T is of type Any?, to make it to not accept null types, it must be explicitly made to
// type of Any.  And also type parameter type in the constructor would be made non-nullable type T not T?.

fun main() {
    val objOfMyClass = MyClass<String>("Assalamu-Alaikum")
    // println(objOfMyClass.data)  // Error: Couldn't be accessed because data isn't mentioned with val or var keywords
    val objOfMyClass2 = MyClass2<Int>(39)
    println(objOfMyClass2.data2)    // Success: Could be accessed because it is mentioned with val or var

    val objOfMyClass3 = MyClass2(null)
    println(objOfMyClass3.data2)
}