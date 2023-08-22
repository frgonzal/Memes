package aux2.person

import aux2.bank.Bank

//addOne, indexOf, remove

class Person(val name: String, var age: Int) {
    var bank: Bank = null

    def Birthday(): Unit = age += 1

    def BankSubscribe(newBank: Bank): Unit = {
        bank = newBank
        newBank.AddNewSubscriber(person = this)
    }

    def BankUnsubscribe(): Unit = {
        bank.removeSubscriber(person = this)
        bank = null
    }


}