fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    //ini untuk yg 2 parameter lebih
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Hury", "Mansur")
    println(result)

    //ini cocok untuk 1 variable
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Hury"))

    //method reference
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Hury Mansur"))
}