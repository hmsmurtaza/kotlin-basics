package kotlin_generics.generic_classes

open class Waste
class Plastic : Waste()

interface TrashBin<in T> {
    fun put(item: T)
}

fun main() {
    val generalBin: TrashBin<Waste> = object : TrashBin<Waste> {
        override fun put(item: Waste) {
            println("Discarding waste...")
        }
    }

    // This is allowed because of 'in'
    // Superclass object TrashBin<Waste> assigned to subclass TrashBin<Plastic>
    val plasticWaste: TrashBin<Plastic> = generalBin
    plasticWaste.put(Plastic())
}