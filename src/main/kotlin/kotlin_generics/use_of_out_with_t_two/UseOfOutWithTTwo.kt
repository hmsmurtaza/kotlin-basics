package kotlin_generics.use_of_out_with_t_two

class OutClass<out T>(val value: T) {
    fun get(): T = value
}

fun main() {
    val out: OutClass<String> = OutClass<String>("string")
    val ref: OutClass<Any> = out
}