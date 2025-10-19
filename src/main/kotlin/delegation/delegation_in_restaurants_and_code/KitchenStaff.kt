package delegation.delegation_in_restaurants_and_code

interface KitchenStaff {
    fun prepareEntree(name: String): Entree?

    // new implementation for the KitchenStaff interface
    val specials: List<String>
    fun prepareAppetizer(name: String)
    fun prepareDessert(name: String)
    fun receiveCompliment(message: String)
}