package miscellaneous_patterns_learning.facade_pattern

class SmartLight {
    fun dim() = println("Lights dimmed to 20%")
    fun on() = println("Lights are ON")
}

class Television {
    fun turnOn() = println("TV is ON")
    fun setMovieMode() = println("TV set to Cinema Mode")
}

class AirConditioner {
    fun setTemperature(temperature: Int) = println("AC set to $temperature°C")
}

class HomeTheaterFacade(
    private val light: SmartLight,
    private val television: Television,
    private val airConditioner: AirConditioner,
) {
    // This is the "Magic Button"
    fun watchMovie() {
        println("Preparing the theater...")
        light.dim()
        airConditioner.setTemperature(22)
        television.turnOn()
        television.setMovieMode()
        println("Movie started!")
    }

    fun endMovie() {
        println("Shutting down...")
        light.on()
        television.turnOn()
    }
}

fun main() {
    val facade = HomeTheaterFacade(SmartLight(), Television(), AirConditioner())
    facade.watchMovie()
    facade.endMovie()
}