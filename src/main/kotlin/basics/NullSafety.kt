package basics

val notNullText: String = "Definitely not null"
val nullableText1: String? = "Might be null"
val nullableText2: String? = null

fun funny(text: String?): Unit {
    if (text != null) {
        println(text)
    } else {
        println("Nothing to print")
    }
}

fun funnier(text: String?): Unit {
    val toPrint = text ?: "Nothing to print :("
    println(toPrint)
}

fun main() {
    println(notNullText)
    println(nullableText1)
    println(nullableText2)
    funny("Hello world!")
    funnier(null)
}