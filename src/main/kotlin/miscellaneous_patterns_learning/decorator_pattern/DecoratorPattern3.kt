package miscellaneous_patterns_learning.decorator_pattern

interface Coffee3 {
    fun getCost(): Double
    fun getDescription(): String
//    fun getCoffeeShopLocation(): String
}

// 2. Concrete Component
class SimpleCoffee3 : Coffee3 {
    override fun getCost() = 5.0
    override fun getDescription() = "Simple Coffee"
}

// 3. Decorator using 'by' (No abstract class needed)
class MilkDecorator3(private val innerCoffee: Coffee3) : Coffee3 by innerCoffee {
    override fun getCost() = innerCoffee.getCost() + 2.0
    override fun getDescription() = innerCoffee.getDescription() + ", Milk"
}

class SugarDecorator3(private val innerCoffee: Coffee3) : Coffee3 by innerCoffee {
    override fun getCost() = innerCoffee.getCost() + 1.0
    override fun getDescription() = innerCoffee.getDescription() + ", Sugar"
}

fun main() {
    val basicCoffee: Coffee3 = SimpleCoffee3()
    println("Order 1: ${basicCoffee.getDescription()} | Cost: $${basicCoffee.getCost()}")
    val milkDecorator3: Coffee3 = MilkDecorator3(basicCoffee)
    println("Order 2: ${milkDecorator3.getDescription()} | Cost: $${milkDecorator3.getCost()}")
    val sugarDecorator3: Coffee3 = SugarDecorator3(milkDecorator3)
    println("Order 3: ${sugarDecorator3.getDescription()} | Cost: $${sugarDecorator3.getCost()}")
    val fullyLoadedCoffee3: Coffee3 = SugarDecorator3(MilkDecorator3(SimpleCoffee3()))
    println("Order 4: ${fullyLoadedCoffee3.getDescription()} | Cost: $${fullyLoadedCoffee3.getCost()}")

//    println("Order: ${myOrder3.getCost()}")
//    println("Total cost: ${myOrder3.getDescription()}")
}