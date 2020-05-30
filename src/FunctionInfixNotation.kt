//infix notation adalah operasi yg biasa dilakukan di operasi matematika, dimana dia melakukan operasi terhadap dua data
//hampir semua operasi matematika adalah infix notation
//di kotlin, kita bisa membuat function infix notation juga
//untuk menggunakan function infix notation, tidak wajib menggunakan titik . (titik)

//Syaratnya
//harus sebagain function member atau function extension
//harus memiliki 1 parameter
//parameter tidak boleh varargs dan tidak boleh memiliki nilai default
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}
fun main() {
    val result = "Hury Mansur" to "UP"
    println(result)
}