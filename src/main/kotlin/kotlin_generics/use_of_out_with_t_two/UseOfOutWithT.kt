package kotlin_generics.use_of_out_with_t_two

class UseOfOutWithT<out T>(var value: @UnsafeVariance T) {
    fun updateValue(newValue: @UnsafeVariance T) {
        value = newValue
    }

    override fun toString(): String {
        return value.toString()
    }
}

fun main() {
    val outWithT: UseOfOutWithT<String> = UseOfOutWithT("Shoaib")
    outWithT.updateValue("Shoaib Murtaza")
    println(outWithT)
}