package aux2

import aux2.bank.Bank
import aux2.person.Person

object Main{
    def main(args: Array[String]): Unit = {

        val franco: Person = new Person("Franco", 20)
        val antonio: Person = new Person("Antonio", 20)

        val BancoEstado: Bank = new Bank("BancoEstado")

        franco.BankSubscribe(BancoEstado)
        antonio.BankSubscribe(BancoEstado)

        println(s"Edad: ${franco.age}")
        println(s"Nombre Banco: ${franco.bank.name}")
        franco.Birthday()
        println(s"Edad: ${franco.age}")
        println(s"\nBank Subscribers: ${BancoEstado.subscribers}")
    
    }
}