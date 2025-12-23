package miscellaneous_patterns_learning

class Pizza private constructor(
    val size: String,
    val cheese: Boolean,
    val pepperoni: Boolean,
) {
    class Builder {
        private var size: String = "Medium"
        private var cheese: Boolean = false
        private var pepperoni: Boolean = false

        fun setSize(size: String) = apply {
            this.size = size
        }

        fun addCheese(cheese: Boolean) = apply { this.cheese = cheese }
        fun addPepperoni(pepperoni: Boolean) = apply { this.pepperoni = pepperoni }

        fun build() = Pizza(size, cheese, pepperoni)
    }

    override fun toString(): String {
        return "Custom order: A $size pizza with ${if (cheese) "extra cheese" else "no cheese"} and with ${if (pepperoni) "pepperoni." else ""}"
    }
}

fun main() {
    val pizza = Pizza.Builder()
        .setSize("Larget")
        .addCheese(true)
        .addPepperoni(true)
        .build()
    println(pizza)  // Shows output, calls custom defined .toString() implicitly, no need to call .toString() explicitly
    // pizza.toString()    // Doesn't show output
}