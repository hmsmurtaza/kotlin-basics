package generics_with_upper_bound

fun <T : Number> findMax(items: List<T>): T {
    if (items.isEmpty()) throw IllegalStateException("List must not be empty")

    var maxItem = items.first()
    for( item in items) {
        if (item.toDouble() > maxItem.toDouble()) {
            maxItem = item
        }
    }
    return maxItem
}

fun main() {
    val integers = listOf(1, 2, 3, 4)
    val maxInteger = findMax(integers)
    println("The maximum among integer is $maxInteger")

    val doubles = listOf(1.1, 2.2, 3.3, 4.4)
    val maxDouble = findMax(doubles)
    println("The maximum among doubles is $maxDouble")

    // val words = listOf("Apple", "Banana", "Cat", "Dog")
    // val maxWord = findMax(words)
    // println("The maximum among words is $maxWord")
}