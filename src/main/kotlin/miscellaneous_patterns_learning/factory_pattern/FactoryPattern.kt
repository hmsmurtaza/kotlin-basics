package miscellaneous_patterns_learning.factory_pattern

interface Notification {
    fun send()
}

class SMSNotification : Notification {
    override fun send() {
        // Specific logic for SMS (e.g, connecting to a cellular gateway)
        println("Logic: Sending SMS via SMS Cellular Service")
    }
}

class EmailNotification: Notification {
    override fun send() {
        // Specific logic for Email (e.g, Setting up SMTP or SendGrid)
        println("Logic: Sending Email via SMTP server...")
    }
}

class NotificationService {
    fun sendNotification(type: String) {
        val notification = when(type) {
            "SMS" -> SMSNotification()
            "Email" -> EmailNotification()
            else -> throw IllegalArgumentException("Unknown type")
        }
        return notification.send()
    }
}

fun main() {
    val service = NotificationService()

    service.sendNotification("Email")
    service.sendNotification("SMS")
}