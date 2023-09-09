package c01

object Main {
    def main(args: Array[String]): Unit = {
        val x: IAccount = new VIPAccount
        println(s"${x.getBalance()}")

    }
}
