//closure adalah kemampuan sebuah function, lambda atau anonymous funcion berinteraksi dengan data-data disekitarnya dalan scope yang sama
//harap gunakan fitur closure in dengan bijak saat kita membuat aplikasi

fun main() {
    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncremet() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncremet()
    lambdaIncrement()
    anonymousIncrement()
    functionIncremet()

    println(counter)
}