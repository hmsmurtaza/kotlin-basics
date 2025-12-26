package miscellaneous_patterns_learning.observer_pattern

interface Observer {
    fun update(news: String)
}

class MyNewsAgency {
    private val channels = mutableListOf<Observer>()

    fun addObserver(channel: Observer) {
        channels.add(channel)
    }

    fun removeObserver(channel: Observer) {
        channels.remove(channel)
    }

    fun broadcastNews(news: String) {
        for (channel in channels) {
            channel.update(news)
        }
    }
}

class NewsChannel(val name: String): Observer {
    override fun update(news: String) {
        println("$name received breaking news: $news")
    }
}

fun main() {
    val agency = MyNewsAgency()

    val bbc = NewsChannel("BBC")
    val cnn = NewsChannel("CNN")

    agency.addObserver(bbc)
    agency.addObserver(cnn)

    agency.broadcastNews("Kotlin 2.0 is officially released!")

    agency.removeObserver(bbc)

    agency.broadcastNews("AI made Kotlin development easy!")
}