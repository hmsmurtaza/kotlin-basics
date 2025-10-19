package basics

/**
 * If the expression to the left of the Elvis Operator ?: is not null,
 * the Elvis operator returns it, otherwise it returns the expression
 * to the right side of it.
 *
 * Note that the expression on the right-hand side is evaluated only if
 * the expression on the left-hand side is null.
 */

fun checkElvisOperator(text: String?){
    val toPrint = text ?: "Nothing to print :("
    println(toPrint)
}

fun main() {
    checkElvisOperator( text = null)
}