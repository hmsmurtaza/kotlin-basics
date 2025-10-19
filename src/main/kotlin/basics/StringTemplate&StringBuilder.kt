package basics

import java.lang.StringBuilder


fun main() {
    val i = 10
    val s = "kotlin"

    println("i = $i")
    println("Length of $s is ${s.length}")

    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello")
    stringBuilder.append(", World!")
    println(stringBuilder.toString())
}