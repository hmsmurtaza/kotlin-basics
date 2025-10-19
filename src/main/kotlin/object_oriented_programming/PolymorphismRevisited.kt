package object_oriented_programming

interface DomesticAnimal {
    fun pet()
}

class Dog : DomesticAnimal {
    override fun pet() {
        println("Dog::pet()")
    }
}

class Cat : DomesticAnimal {
    override fun pet() {
        println("Cat::pet()")
    }
}

fun main() {
    val homeZoo = listOf<DomesticAnimal>(Dog(), Cat())
    homeZoo.forEach {
        it.pet()
    }
}