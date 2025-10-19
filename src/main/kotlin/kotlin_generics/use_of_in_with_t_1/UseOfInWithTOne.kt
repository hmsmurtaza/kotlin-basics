package kotlin_generics.use_of_in_with_t_1

interface Consumer<in T> {
    fun consume(item: T)
}

fun main() {
    val animalConsumer: Consumer<Animal> = object : Consumer<Animal> {
        override fun consume(item: Animal) {
            println("Consumed item $item")
        }
    }

    // subtype object               // supertype object
    val dogConsumer: Consumer<Dog> = animalConsumer
    dogConsumer.consume(Dog())
    val catConsumer: Consumer<Cat> = animalConsumer
    catConsumer.consume(Cat())
}

open class Animal
class Dog : Animal()
class Cat : Animal()