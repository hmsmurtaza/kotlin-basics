package basics.class_data_class_and_object_keyword_usage


class User (
    val id: Int,
    val name: String
)

// Data class usage
data class User2(
    val id: Int,
    val name: String
)


fun main() {
    val user1 = User(1, "Ali")
    val user2 = User(2, "Ahmed")
    println("$user1 and $user2")

    val user = User2(1, "Ali")
    val updatedUser = user.copy(name = "Ahmed")
    println("$user $updatedUser")
}