package kotlin_generics.generic_classes

class Box<T>(var content: T) {
    // Using T as a return type like String or Int
    fun getItem(): T {
        return content
    }

    // Using T as a function parameter like String or Int
    fun updateItem(newItem: T) {
        content = newItem
        println("Box updated.")
    }
}

fun main() {
    val stringBox = Box("String box.")
    println("${stringBox.getItem()}")
    stringBox.updateItem("Updated string box.")
    println("${stringBox.getItem()}")

    val intBox = Box(20)
    println("${intBox.getItem()}")
    intBox.updateItem(30)
    println("${intBox.getItem()}")
}