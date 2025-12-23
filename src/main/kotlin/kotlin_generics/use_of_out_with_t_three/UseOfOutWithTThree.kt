package kotlin_generics.use_of_out_with_t_three

//import jdk.nashorn.internal.objects.Global.println

class Producer<out T>(val value: T) {
    fun get(): T = value
}

fun main() {
    val producerStringBase = Producer<String>("hmsmurtaza")
    val producerAnySub: Producer<Any> = producerStringBase
    println(producerAnySub.get())

    val producerNumberBase = Producer<Number>(123)
    val producerAnuSub: Producer<Any> = producerNumberBase
    println(producerAnuSub.get())
}
