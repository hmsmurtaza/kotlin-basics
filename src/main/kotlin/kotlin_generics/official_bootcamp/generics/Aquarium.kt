package kotlin_generics.official_bootcamp.generics

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

fun genericsExample() {
    /*val aquarium = Aquarium(TapWater())
    println("Water need processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Water need processing: ${aquarium.waterSupply.needsProcessing}")*/

    /*val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)*/

    /*val aquarium3 = Aquarium(null)
    if (aquarium3.waterSupply == null) {
        println("water supply is null")
    }*/

/*    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()*/

    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
}

fun main(args: Array<String>) {
    genericsExample()
}

// Parent class
open class WaterSupply(var needsProcessing: Boolean) {
}

// Child class-I
class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

// Child class-II
class FishStoreWater : WaterSupply(false)

// Child class-III
class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    /*fun addWater() {
        check(!waterSupply.needsProcessing) { println("Water supply needs processing first") }
        println("Adding water from $waterSupply")
    }*/
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}