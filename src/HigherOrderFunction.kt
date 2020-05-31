fun main() {
    fun hello(name: String, trasformer: (String) -> String): String {
        val nameTransformer = trasformer(name)
        return "Hello $nameTransformer"
    }
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Eko", lambdaUpper))

    println(hello("Hury", {value: String -> value.toLowerCase()}))

    //trailing lambda
    val result = hello("Hury") { value: String ->
        value.toUpperCase()
    }
    println(result)
}