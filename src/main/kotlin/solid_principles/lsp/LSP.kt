package solid_principles.lsp

abstract class Account(var balance: Double)

interface Withdrawable{
    fun withdraw(amount: Double)
}

class SavingsAccount(balance: Double) : Account(balance), Withdrawable {
    override fun withdraw(amount: Double) {
        if (amount < balance) {
            balance -= amount
            println("Successfully withdrawn $amount. New balance is $balance")
        }
    }
}

class FixedDeposit(balance: Double): Account(balance) {
    // No withdraw method here, LSP is safe
}

class ATMService {
    fun performTransaction(account: Withdrawable, amount: Double) {
        account.withdraw(amount)
    }
}

fun main() {
    val mySavings = SavingsAccount(1000.0)
    val myFixed = FixedDeposit(5000.0)

    val atm = ATMService()

    atm.performTransaction(mySavings, 100.0)

    // atm.performTransaction(myFixed, 100.0) COMPILER ERROR: FixedDepositAccount is not a Withdrawable.
}