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

class EasypaisaPayment : PaymentMethod {
    override fun processPayment(amount: Double) {
        println("Payment of $$amount by easypaisa is processed.")
    }
}
/**
 * Simple way Factory
 */
/*class PaymentFactory {
    fun makePayment(paymentMethod: String) {
        val method = when (paymentMethod.uppercase(getDefault())) {
            "CREDITCARD" -> CreditCardPayment()
            "PAYPAL" -> PayPalPayment()
            else -> throw IllegalArgumentException("Unknown type")
        }
//        return
        method.processPayment(2.0)
    }
}*/

// The Factory pattern method
object NotificationFactory {
    fun createNotification(type: String): PaymentMethod {
        return when(type.uppercase(getDefault())) {
            "CREDITCARD" -> CreditCardPayment()
            "PAYPAL" -> PayPalPayment()
            "EASYPAISA" -> EasypaisaPayment()
            else -> throw IllegalArgumentException("Wrong type")
        }
    }
}

fun main() {
//    val paymentFactory = PaymentFactory()

    val notification = NotificationFactory.createNotification("easypaisa")
    notification.processPayment(100.0)
    /*paymentFactory.makePayment("Creditcard")
    paymentFactory.makePayment("Paypal")*/
}