package basics.oop.val_or_var_keywords

class MyClass<T>(data: T?)
class MyClass2<T>(val data2: T?)

fun main() {
    val objOfMyClass = MyClass<String>("Assalamu-Alaikum")
    // println(objOfMyClass.data)  // Error: Couldn't be accessed because data isn't mentioned with val or var
    val objOfMyClass2 = MyClass2<Int>(39)
    println(objOfMyClass2.data2)    // Success: Could be accessed because it is mentioned with val or var
}