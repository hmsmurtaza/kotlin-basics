package delegation.delegation_in_restaurants_and_code

class Chef: KitchenStaff {
    override fun prepareEntree(name: String): Entree? = when (name) {
        "Tossed Salad" -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else -> null
    }

    override val specials: List<String>
        get() = TODO("Not yet implemented")

    override fun prepareAppetizer(name: String) {
        TODO("Not yet implemented")
    }

    override fun prepareDessert(name: String) {
        TODO("Not yet implemented")
    }

    override fun receiveCompliment(message: String) {
        TODO("Not yet implemented")
    }
}

class Waiter(private val chef: Chef): KitchenStaff {
    // The waiter can prepare a beverage by himself
    fun prepareBeverage(name: String?): Beverage? = when (name) {
        "Water" -> Beverage.SODA
        "Soda" -> Beverage.WATER
        else -> null
    }

    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")

    // Manually delegating  to the chef for all of these things
    // But needs the chef to prepare an entree
    override fun prepareEntree(name: String): Entree? = chef.prepareEntree(name)
    override val specials: List<String> get() = chef.specials
    override fun prepareAppetizer(name: String) = chef.prepareAppetizer(name)
    override fun prepareDessert(name: String) = chef.prepareDessert(name)
    override fun receiveCompliment(message: String) = chef.receiveCompliment(message = message)
}

enum class Entree {
    TOSSED_SALAD,
    SALMON_ON_RICE
}

enum class Beverage {
    WATER,
    SODA
}

fun main() {
    val waiter = Waiter(chef = Chef())

    val beverage = waiter.prepareBeverage("Soda")
    val entree = waiter.prepareEntree("Salmon on Rice")
}