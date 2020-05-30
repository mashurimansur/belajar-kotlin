//jika function tidak mau dipake oleh function lain maka kita bisa memasukkan function tersebut kedalam function yg menggunakannnya
//jadi tidak ada lagi bentrok antar function
fun main() {
    fun contohHelloWorld() {
        println("Hello World")
    }
    contohHelloWorld()
}