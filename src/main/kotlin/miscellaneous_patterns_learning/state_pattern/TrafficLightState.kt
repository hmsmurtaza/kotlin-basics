package miscellaneous_patterns_learning.state_pattern

// 1. State interface
interface TrafficLightState {
    fun handleRequest(): String
}

// 2. Implementations
class RedState : TrafficLightState {
    override fun handleRequest(): String {
        return "The light is Red. Stop."
    }
}

class YellowState : TrafficLightState {
    override fun handleRequest(): String {
        return "The light is Yellow. Be prepared/ be cautious"
    }
}

class GreenState : TrafficLightState {
    override fun handleRequest(): String {
        return "The light is Green. Go."
    }
}

// 3. Context class
class TrafficLightContext {
    private var state: TrafficLightState = RedState()

    fun setState(state: TrafficLightState) {
        this.state = state
    }

    fun request(): String {
        return state.handleRequest()
    }
}

// Usage
fun main() {
    val trafficLightContext = TrafficLightContext()

    println(trafficLightContext.request())

    trafficLightContext.setState(YellowState())
    println(trafficLightContext.request())

    trafficLightContext.setState(GreenState())
    println(trafficLightContext.request())
}