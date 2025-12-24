package miscellaneous_patterns_learning.observer_pattern

interface NewsletterSubscriber {
    fun sendNewsletter(title: String)
}

class AnyPlatform {
    private val subscribers = mutableListOf<NewsletterSubscriber>()

    fun addSubscriber(newsletterSubscriber: NewsletterSubscriber) {
        subscribers.add(newsletterSubscriber)
        println("New newsletter subscriber added")
    }

    fun removeNewsletterSubscriber(newsletterSubscriber: NewsletterSubscriber) {
        subscribers.remove(newsletterSubscriber)
        println("Newsletter subscriber removed")
    }

    fun send(newsletter: String) {
        for (newsletterSubscriber in subscribers) {
            println("${newsletterSubscriber.sendNewsletter(newsletter)} has received new newsletter with title $newsletter")
        }
    }
}

class NewsletterReceiver(val name: String) : NewsletterSubscriber {
    override fun sendNewsletter(title: String) {
        println("Hey $name, New newsletter of title $title is out now!")
    }
}

fun main() {
    val platform = AnyPlatform()

    val Shoaib = NewsletterReceiver("Shoaib")
    val Murtaza = NewsletterReceiver("Murtaza")

    platform.addSubscriber(Shoaib)
    platform.addSubscriber(Murtaza)

    platform.send("Hello, world! This is Kotlin.")

    platform.removeNewsletterSubscriber(Shoaib)

    platform.send("Hello, world! This is Observer pattern.")
}