package miscellaneous_patterns_learning.strategy_pattern

// Defined a task in the form an interface
interface DataFetchStrategy {
    fun loadData()
}

// Selected a tool by picking a correct implementation (The strategy)
class CloudFetchStrategy : DataFetchStrategy {
    override fun loadData() {
        println("Connecting to API... Downloading high-res images...")
    }
}

class LocalCacheStrategy : DataFetchStrategy {
    override fun loadData() {
        println("No internet. Loading last saved data from SQLite Databases.")
    }
}

class DataSaverStrategy: DataFetchStrategy {
    override fun loadData() {
        println("Data saver on. Fetching text-only version from API...")
    }
}

// Executed: Called the method defined in the interface
class NewsRepository {
    fun refreshNews(isOnline: Boolean, isDataSaver: Boolean) {
        val strategy: DataFetchStrategy = when {
            !isOnline -> LocalCacheStrategy()
            isDataSaver -> DataSaverStrategy()
            else -> CloudFetchStrategy()
        }
        // Here
        strategy.loadData()
    }
}

fun main() {
    val repository = NewsRepository()

    println("--- Scenario: User is in a tunnel ---")
    repository.refreshNews(false, false)

    println("\n--- Scenario: User has 'low data' mode on ---")
    repository.refreshNews(isOnline = true, isDataSaver = true)
}