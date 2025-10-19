package delegation

/**
 * Example for learning delegation pattern, using 'by' keyword
 */

interface Printer {
    fun print()
}

class RealPrinter : Printer {
    override fun print() {
        println("Printing...")
    }
}

class DelegatePrinter(private val printer: Printer): Printer by printer

fun main() {
    val realPrinter = RealPrinter()
    val delegatePrinter = DelegatePrinter(realPrinter)
    delegatePrinter.print()
}

