package kotlin_generics.generic_classes

// Covariance
open class Fruit
class Apple : Fruit()

interface Producer<out T> {
    fun produce(): T
}

fun main() {
    val appleProducer: Producer<Apple> = object : Producer<Apple> {
        override fun produce() = Apple()
    }

    val fruitProducer: Producer<Fruit> = appleProducer
    fruitProducer.produce()
}