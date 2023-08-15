package c01

object Main {
    def main(args: Array[String]): Unit = {

        val x: IAccount = JAccount

        x.withdraw(10)
        println(JAccount.getBalance())
        println(x.getBalance())
        println(x == JAccount)

    }
}
