package miscellaneous_patterns_learning.factory_pattern

import java.util.Locale.getDefault

interface PaymentMethod {
    fun processPayment(amount: Double)
}

class CreditCardPayment : PaymentMethod {
    override fun processPayment(amount: Double) {
        println("Payment of $$amount by Credit card is processed.")
    }
}

class PayPalPayment : PaymentMethod {
    override fun processPayment(amount: Double) {
        println("Payment of $$amount by PayPal is processed.")
    }
}

class PaymentFactory {
    fun makePayment(paymentMethod: String) {
        val method = when (paymentMethod.uppercase(getDefault())) {
            "CREDITCARD" -> CreditCardPayment()
            "PAYPAL" -> PayPalPayment()
            else -> throw IllegalArgumentException("Unknown type")
        }
//        return
        method.processPayment(2.0)
    }
}

fun main() {
    val paymentFactory = PaymentFactory()

    paymentFactory.makePayment("Creditcard")
    paymentFactory.makePayment("Paypal")
}