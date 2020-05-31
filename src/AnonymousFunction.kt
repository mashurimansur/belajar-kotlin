fun main() {
    fun hello(name: String, trasformer: (String) -> String): String {
        val nameTransformer = trasformer(name)
        return "Hello $nameTransformer"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Hury", upper))
    println(hello("", upper))
    println(hello("Mansur", fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }))
}