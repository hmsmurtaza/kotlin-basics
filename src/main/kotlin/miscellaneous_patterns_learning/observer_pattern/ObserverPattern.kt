package miscellaneous_patterns_learning.observer_pattern

interface  NewsObserver {
    fun observer(title: String)
}

class NewsAgency {
    val observers = mutableListOf<NewsObserver>()

    fun subscribe(observer: NewsObserver) {
        observers.add(observer)
    }

    fun unsubscribe(observer: NewsObserver) {
        observers.remove(observer)
    }

    fun publishNews(article: String) {
        observers.forEach { it.observer(article) }
    }
}

fun main() {
    val agency= NewsAgency()

    val reader = object : NewsObserver {
        override fun observer(title: String) {
            println("Reader received $title")
        }
    }

    agency.subscribe(reader)
    agency.publishNews("Breaking: Observer Pattern is awesome!")
    agency.unsubscribe(reader)
}