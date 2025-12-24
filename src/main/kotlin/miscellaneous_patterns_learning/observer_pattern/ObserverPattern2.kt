package miscellaneous_patterns_learning.observer_pattern

interface Subscriber {
    val name: String
    fun onNewVideoPublished(videoTitle: String)
}

// The Subject: The YouTube Channel
class YoutubeChannel(val channelName: String) {
    private val subscribers = mutableListOf<Subscriber>()

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
        println("${subscriber.name} subscribed the $channelName")
    }

    fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
        println("${subscriber.name} unsubscribed the $channelName")
    }

    fun uploadVideo(videoTitle: String) {
        println("$channelName uploaded the $videoTitle")
        for (subscriber in subscribers) {
            subscriber.onNewVideoPublished(videoTitle)
        }
    }
}

class User(override val name: String) : Subscriber {
    override fun onNewVideoPublished(videoTitle: String) {
        println("Hey $name, New notification of $videoTitle is out now")
    }
}
fun main() {
    val techChannel = YoutubeChannel("Kotlin Learning")

    val alice = User("Alice")
    val bob = User("Bob")

    techChannel.subscribe(alice)
    techChannel.subscribe(bob)

    techChannel.uploadVideo("Observer pattern tutorial")

    techChannel.unsubscribe(alice)

    techChannel.uploadVideo("Advance Kotlin Coroutines")
}