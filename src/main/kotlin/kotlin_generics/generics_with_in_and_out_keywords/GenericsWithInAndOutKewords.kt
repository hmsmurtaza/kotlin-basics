package kotlin_generics.generics_with_in_and_out_keywords

// Animal class hierarchy
open class Animal
class Dog: Animal()
class Cat: Animal()

class AnimalShelter<out T : Animal>{
    private val animals: MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: @UnsafeVariance T) {
        animals.add(animal)
    }


    //fun getAnimal(): T? = animals.first()
}

fun main() {
    /*val dogShelter = AnimalShelter<Dog>()

    val animalShelter: AnimalShelter<Animal> = dogShelter   // Works because of covariance
    animalShelter.addAnimal(Dog())
    animalShelter.addAnimal(Dog())
    animalShelter.addAnimal(Dog())
    // Get an animal from the shelter
    val animal: Animal? = animalShelter.getAnimal()
    println(animal)*/

    val dogs = listOf<Animal>(Dog(), Dog(), Dog())
 //   val dogShelter = AnimalShelter(dogs)
  //  val animalShelter: AnimalShelter<Animal> = dogShelter

  // val animal : Animal? = animalShelter.getAnimal()
 //   println(animal)
}
