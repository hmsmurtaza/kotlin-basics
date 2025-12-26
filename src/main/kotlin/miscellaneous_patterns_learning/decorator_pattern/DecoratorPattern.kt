package miscellaneous_patterns_learning.decorator_pattern

interface Notifier {
    fun send(message: String)
}

// Base implementation
class BasicNotifier : Notifier {
    override fun send(message: String) = println("Sending base notification: $message")
}

// Decorator
class EmailDecorator(private val innerNotifier: Notifier): Notifier by innerNotifier {
    override fun send(message: String) {
        innerNotifier.send(message) // This calls BasicNotifier.send()
        println("Sending Email extra step: $message")
    }
}

fun main() {
    val core = BasicNotifier()
    val decorated = EmailDecorator(core)

    decorated.send("Hi there!")
}