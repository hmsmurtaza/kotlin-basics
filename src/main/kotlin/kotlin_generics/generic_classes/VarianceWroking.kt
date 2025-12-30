package kotlin_generics.generic_classes

class Box1<T>(val item: T)

fun main() {
    val stringBox: Box<String> = Box<String>("Shoaib")
    // val anyBox: Box<Any> = stringBox // Error: Type mismatch, because in generics,
    // assigning of Box<String> object to Box<Any> isn't allowed though String is the
    // subclass of Any. Why?, because if language allowed this, you could accidently
    // put a Box<Int> into Box<Any> slot, which would break the stringBox stack that
    // was created only to hold string values.
}