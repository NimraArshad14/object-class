fun main() {

    database.connect()


}
object database {
    val name = "kotlinDB"

    fun connect() {

        println("connected to $name")
    }

}