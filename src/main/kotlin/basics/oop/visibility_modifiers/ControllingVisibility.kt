package basics.oop.visibility_modifiers

open class Resource<T>(private val data: T?, val error: String?)

class User(private val _name: String) { // For Developers with Java background
    val name: String get() = _name
}

fun main() {
    val resource = Resource("Secret", null)
    // println(resource.data)  // Error: couldn't access 'data' parameter because its accessibility is 'private'
    println(resource.error)

    val user = User("Shoaib")
    println(user.name)
}