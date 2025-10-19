package data_class_by_default_methods.copy_method

data class ProfileUiState(
    val isLoading: Boolean = false,
    val userName: String = ""
)

fun main() {
    // 1. Create the initial, immutable state object
    val originalState = ProfileUiState(isLoading = true, userName = "Shoaib")
    println("Original state: $originalState")

    // 2. Use `copy()` to create a new object with a change
    val updatedState = originalState.copy(isLoading = false)
    println("Updated state: $updatedState")

    // 3. The original object is completely unchanged.
    println("Original state after copy: $originalState")

    // 4. The new object has the modified property
    println("Updated state after copy: ${updatedState.isLoading}")

    // 5. Check if they are the same object in memory
    println("Is the original state and updated state the same object? ${originalState === updatedState}")
}