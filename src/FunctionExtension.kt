fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit {
    println("Hello $this")
}

fun main() {
    val name = "Hury"
    println(name.hello())
    "Iqbal".printHello()
}