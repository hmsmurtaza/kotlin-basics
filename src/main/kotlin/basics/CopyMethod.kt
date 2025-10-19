package basics

data class ProfileUiState(
    val isLoading: Boolean = true,
    val userName: String = ""
)

//import kotlin.io.*
fun main() {
    val profileUiState = ProfileUiState(userName = "Alex")
    val updatedState = profileUiState.copy(userName = "Max")
    println(profileUiState)
    println(updatedState)
}