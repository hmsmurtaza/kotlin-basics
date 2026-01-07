package miscellaneous_patterns_learning.strategy_pattern

// Define the strategy interface
interface PlaybackStrategy {
    fun process()
}

// Implementation of Strategies
class SlowMotionStrategy : PlaybackStrategy {
    companion object {
        const val PLAY_BACK_SPEED = 0.5
    }

    override fun process() {
        println("Video is playing on $PLAY_BACK_SPEED speed.")
    }
}

class NormalStrategy : PlaybackStrategy {
    companion object {
        const val PLAY_BACK_SPEED = 1.0
    }

    override fun process() {
        println("Video is playing on $PLAY_BACK_SPEED speed.")
    }
}

class FastForwardStrategy : PlaybackStrategy {
    companion object {
        const val PLAY_BACK_SPEED = 2.0
    }

    override fun process() {
        println("Video is playing on $PLAY_BACK_SPEED speed.")
    }
}

// The context class
class VideoPlayer(var strategy: PlaybackStrategy) {
    fun setPlaybackStrategy(newStrategy: PlaybackStrategy) {
        this.strategy = newStrategy
    }

    fun playVideo() {
        strategy.process()
    }
}

fun main() {

}