package c01

trait IAccount {
    def getBalance(): Int
    def withdraw(n: Int): Boolean
    def deposit(n: Int): Boolean
}

object JAccount extends IAccount {
    private var balance: Int = 10000
    private val currency: String = "CLP"

    def getBalance(): Int = balance
    def withdraw(n: Int): Boolean = {
        if(balance>=n){
            balance -= n
            true
        }else false
    }
    def deposit(n: Int): Boolean = {
        balance += n
        true
    }
}