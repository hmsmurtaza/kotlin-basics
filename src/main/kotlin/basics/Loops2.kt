package basics

// There are break and continue labels for loops:

fun myLabelPractice() {
    val items = listOf("apple", "banana", "kiwifruit")

    myLabel@ for (item in items) {
        /*for (anotherItem in items) {
            if (item) break@myLabel
            else continue@myLabel
        }*/
    }
}
