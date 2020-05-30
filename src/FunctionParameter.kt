fun sayHello(name: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $name")
    } else {
        println("Hello $name $lastName")
    }

}
fun main() {
    sayHello("Hury", "Mansur")
    sayHello("Iqbal", null)
}