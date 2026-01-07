package miscellaneous_patterns_learning.strategy_pattern

// The strategy
interface ValidationStrategy {
    fun isValid(input: String): Boolean
}

// Implementations
class EmailValidator : ValidationStrategy {
    override fun isValid(input: String): Boolean {
        println("Checking if '$input' contains '@' and a domain.")
        return input.contains("@") // Simple logic
    }
}

class PasswordValidator : ValidationStrategy {
    override fun isValid(input: String): Boolean {
        println("Checking if '$input' is at least 8 characters long...")
        return input.length > 8
    }
}

// Usage in ViewModel
class RegistrationViewModel {
    fun validateField(text: String, strategy: ValidationStrategy): Boolean {
        return strategy.isValid(text)
    }
}

fun main() {
    val vm = RegistrationViewModel()

    val isEmailValid = vm.validateField("user@Example.com", EmailValidator())
    val isPasswordValid = vm.validateField("12345", PasswordValidator())
    println("Result -> Email: $isEmailValid, Password: $isPasswordValid")
}