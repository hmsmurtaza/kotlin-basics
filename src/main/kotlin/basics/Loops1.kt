package basics

fun printListItems(items: List<String>) {
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun printListItems1(items: List<String>) {
    var toComplete: Boolean
    do {
//        println("item in the list is $")
        toComplete = false
    } while (toComplete)
}   // the condition variable can be initialized inside to the do...while loop.

