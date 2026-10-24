open class BankAccount {
    var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            this.balance += amount
        } else {
            println("Incorrect deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            this.balance -= amount
            println("Your balance is successfully withdrawn")
        } else {
            println("Insufficient funds")
        }
    }
}

class BkashBanking : BankAccount() {
    fun addToBank(amount: Double) {
        deposit(amount)
    }

    fun CashOut(amount: Double) {
        withdraw(amount)
    }
}

class NagadBanking : BankAccount() {
    fun addToBank(amount: Double) {
        deposit(amount)
    }

    fun CashOut(amount: Double) {
        withdraw(amount)
    }
}

fun main() {
    val bank = BankAccount()
    bank.deposit(10000.00)
    println("Your new account balance is ${bank.balance}")
    println("--------------")
    bank.withdraw(4000.00)
    println("Your new account balance is ${bank.balance}")
    println("--------------")

    println("== bKash Transaction ==")
    val bkash = BkashBanking()
    bkash.addToBank(5000.00)
    println("bKash Balance: ${bkash.balance}")
    bkash.CashOut(2000.00)
    println("bKash Balance: ${bkash.balance}")
    println("--------------")

    println("== Nagad Transaction ===")
    val nagad = NagadBanking()
    nagad.addToBank(50000.00)
    println("Nagad Balance: ${nagad.balance}")
    nagad.CashOut(20000.00)
    println("Nagad Balance: ${nagad.balance}")
}
