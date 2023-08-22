package aux2.bank

import aux2.person.Person
import scala.collection.mutable.ArrayBuffer

//addOne, indexOf, remove

class Bank(val name: String) {
    val subscribers: ArrayBuffer[Person] = new ArrayBuffer[Person]()


    def AddNewSubscriber(person: Person): Unit = {
        subscribers.addOne(person)
    }

    def removeSubscriber(person: Person): Unit = {
        subscribers.remove(subscribers.indexOf(person))
    }
}



