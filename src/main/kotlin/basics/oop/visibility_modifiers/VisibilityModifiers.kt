package basics.oop.visibility_modifiers

class ClassWithoutModifier<T>(val data: T?)
class ClassWithModifier<K>(private val name: K)

fun main() {
    val classObjectWithoutVisibilityModifier = ClassWithoutModifier<String>("Hello world")
    val classObjectWithVisibilityModifier = ClassWithModifier<String>("Shoaib")

    // println(classObjectWithVisibilityModifier.name) // Error: Cann't access name because it's accessibility/ visibility modifier is private
    println(classObjectWithoutVisibilityModifier.data)
}