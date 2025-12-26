package miscellaneous_patterns_learning.facade_pattern

// Subsystem 1: Lighting
class SmartLights {
    fun dim(level: Int) = println("Lights dimmed to level $level")
    fun on() = println("Lights are ON")
}

// Subsystem 2: Audio
class SoundBar {
    fun on() = println("Soundbar ON")
    fun setVolume(level: Int) = println("Volume set to level $level")
}

// Subsystem 3: TV
class SmartTV {
    fun on() = println("TV ON")
    fun setSource(source: String) = println("TV source set to $source")
}

// --------The Facade------------
class HomeTheaterFacade2(
    private val smartLights: SmartLights,
    private val soundBar: SoundBar,
    private val smartTV: SmartTV,
) {
    fun watchMovie(movieTitle: String) {
        println("Preparing to watch $movieTitle movie")
        smartLights.dim(20)
        soundBar.on()
        soundBar.setVolume(15)
        smartTV.on()
        smartTV.setSource("HDM 1")
        println("Enjoy your $movieTitle movie!")
    }

    fun endMovie() {
        println("Shutting down theater")
        smartLights.on()
        smartTV.on()
    }
}

fun main() {
    val facade = HomeTheaterFacade2(SmartLights(), SoundBar(), SmartTV())

    facade.watchMovie("Risk")
    facade.endMovie()
}