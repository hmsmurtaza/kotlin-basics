package kotlin_generics.use_of_in_with_t

interface Consumer<in T>{
    fun consume(item: T)
}

class StringConsumer : Consumer<String> {
    override fun consume(item: String) {
        println("Consumed item $item")
    }
}

class AnyConsumer : Consumer<Any> {
    override fun consume(item: Any) {
        println("Consumed item $item")
    }
}

fun main() {
    val stringConsumer: Consumer<String> = StringConsumer()
//    val anyConsumer: Consumer<Any> = AnyConsumer()
//    val anyConsumer1: Consumer<Any> = stringConsumer
//    println(anyConsumer1.consume("Hello"))
}