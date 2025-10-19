import java.sql.DriverManager.println

// In example: Contravariant
interface InExample<in T> {
    fun consume(input: T)
}

// Usage
class StringInExample : InExample<String> {
    override fun consume(input: String) {
        println(input)
    }
}

fun main() {
    val example: InExample<String> = StringInExample()
    example.consume("Just a string")
}

// Out example: Covariant
interface OutExample<out T> {
    fun returnValue(): T
}

// Usage
class StringOutExample : OutExample<String> {
    override fun returnValue() = "Just a string"
}