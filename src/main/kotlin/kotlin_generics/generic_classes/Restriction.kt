package kotlin_generics.generic_classes

open class Animal
class Dog(val name: String) : Animal()

interface BoxRestriction<out T> {
    fun get(): T    // ✅Ok: T is 'out' (return)
    // fun put(item: T) // ❌Error: T is 'in' (argument)
}

fun main() {
    val implementation = object : BoxRestriction<Dog> {
        override fun get(): Dog {
            return Dog("Tommi")
        }
    }
}