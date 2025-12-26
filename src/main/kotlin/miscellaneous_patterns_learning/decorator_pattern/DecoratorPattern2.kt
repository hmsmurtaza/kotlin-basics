package miscellaneous_patterns_learning.decorator_pattern

// 1. The basic interface
interface Coffee {
    fun getCost(): Double
    fun getDescription(): String
//    fun getCoffeeShopLocation(): String  Added to verify interface implementation break due to delegation without 'by' keyword
}

// 2. A concrete component
class SimpleCoffee: Coffee {
    override fun getCost() = 0.5
    override fun getDescription() = "Simple Coffee"
}

// 3. The abstract decorator
abstract class CoffeeDecorator(protected val coffee: Coffee): Coffee {
    override fun getCost() = coffee.getCost()
    override fun getDescription() = coffee.getDescription()
}

// 4. Concrete decorators
class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getCost() = super.getCost() + 2.0
    override fun getDescription() = super.getDescription() + ", Milk"
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun getCost() = super.getCost() + 1.0
    override fun getDescription() = super.getDescription() + ", Sugar"
}

fun main() {
    var myOrder: Coffee = SimpleCoffee()

    myOrder = MilkDecorator(myOrder)

    myOrder = SugarDecorator(myOrder)

    println("Order: ${myOrder.getDescription()}")
    println("Total cost: $${myOrder.getCost()}")
}