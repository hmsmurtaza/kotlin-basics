package miscellaneous_patterns_learning.factory_pattern

interface Notification {
    fun send()
}

class SMSNotification : Notification {
    override fun send() {
        // Specific logic for SMS (e.g., connecting to a cellular gateway)
        println("Logic: Sending SMS via SMS Cellular Service")
    }
}

class EmailNotification: Notification {
    override fun send() {
        // Specific logic for Email (e.g., Setting up SMTP or SendGrid)
        println("Logic: Sending Email via SMTP server...")
    }
}


class WhatsAppNotification: Notification {
    override fun send() {
        println("Logic: Sending message through WhatsApp...")
    }
}

// Simple way
/*class NotificationService {
    fun sendNotification(type: String) {
        val notification = when(type) {
            "SMS" -> SMSNotification()
            "Email" -> EmailNotification()
            "WhatsApp" -> WhatsAppNotification()
            else -> throw IllegalArgumentException("Unknown type")
        }
        return notification.send()
    }
}*/

// Factory pattern method way
object NotificationService {
    fun sendNotification(notification: String): Notification {
        return when(notification) {
            "SMS" -> SMSNotification()
            "Email" -> EmailNotification()
            "WhatsApp" -> WhatsAppNotification()
            else -> throw IllegalArgumentException("Wrong type")
        }
    }
}

fun main() {
    //******************** Other than factory pattern way *******************************
    //val service = NotificationService()

    // We just passed a string.
    // We don't know how the objects are created inside.
    /*service.sendNotification("Email")
    service.sendNotification("SMS")*/
    //************************************************************************************

    //********************* With Factory pattern method ways******************************
    val notificationService = NotificationService.sendNotification("WhatsApp")
    notificationService.send()
    //************************************************************************************
}