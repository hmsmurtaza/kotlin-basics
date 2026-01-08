package miscellaneous_patterns_learning.state_pattern

// 1. State interface
interface ButtonState {
    fun handleState(): String
}

// 2. Implementations
class EnabledState : ButtonState {
    override fun handleState(): String {
        return "In button's Enabled state."
    }
}

class DisabledState : ButtonState {
    override fun handleState(): String {
        return "In button's Disabled state."
    }
}

class PressedState : ButtonState {
    override fun handleState(): String {
        return "In button's Pressed state."
    }
}

// 3. Context class
class ButtonStateContext {
    private var state: ButtonState = EnabledState()

    fun setState(state: ButtonState) {
        this.state = state
    }

    fun request(): String {
        return state.handleState()
    }
}

// 4. Usage
fun main() {
    val initialState = ButtonStateContext()
    println(initialState.request())

    initialState.setState(DisabledState())
    println(initialState.request())

    initialState.setState(PressedState())
    println(initialState.request())
}