package basics.object_keyword

// Object Singleton use case
object AppConstants {
    const val BASE_URL = "https://api.example.com"
    const val DB_NAME = "app_db"
}

// Object as Utitlity class
object DateUtils {
    fun getCurrentYear(): Int {
        return java.util.Calendar.getInstance().get(
            java.util.Calendar.YEAR
        )
    }
}

// Companion object
class User {
    companion object {
        const val ROLL_ADMIN = "admin"

        fun createGuest(): User {
            return User()
        }
    }
}

// Annonymous objects - The objects needed only for one time

// Object with interfaces - Strategy pattern
interface Logger {
    fun log(message: String)
}

object ConsoleLogger: Logger {
    override fun log(message: String) {
        println(message)
    }
}
//============================

fun main() {
    val url = AppConstants.BASE_URL
    val dbName = AppConstants.DB_NAME
    println(url)
    println(dbName)

    // object utils example
    println(DateUtils.getCurrentYear())

    // Companion object example
    val admin = User.ROLL_ADMIN
    val guest = User.createGuest()
    println(admin)
    println(guest)

    // Object usage with interface
    ConsoleLogger.log("Hello world.")
}