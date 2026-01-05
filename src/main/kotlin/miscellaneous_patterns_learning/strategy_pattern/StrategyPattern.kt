package miscellaneous_patterns_learning.strategy_pattern

// That is the contract that all strategies must follow
interface PaymentStrategy {
    fun collectPaymentDetails()
    fun pay(amount: Int)
}

// These are the actual implementation of the algorithm
class CreditCardStrategy: PaymentStrategy {
    override fun collectPaymentDetails() = println("Collecting credit card details...")
    override fun pay(amount: Int) = println("Paid $amount using Credit Card.")
}

class PayPalStrategy : PaymentStrategy {
    override fun collectPaymentDetails() = println("Logging into PayPal..")
    override fun pay(amount: Int) = println("Paid $amount using PayPal.")
}

// This is the class that uses strategy
class ShoppingCart(private var paymentStrategy: PaymentStrategy) {
    fun setPaymentStrategy(newStrategy: PaymentStrategy) {
        this.paymentStrategy = newStrategy
    }

    fun checkout(amount: Int) {
        paymentStrategy.collectPaymentDetails()
        paymentStrategy.pay(amount)
    }
}

fun main() {
    val cart = ShoppingCart(CreditCardStrategy())
    cart.checkout(100)

    println("--- User changes mind ---")

    // Switching strategy at runtime
    cart.setPaymentStrategy(PayPalStrategy())
    cart.checkout(250)
}