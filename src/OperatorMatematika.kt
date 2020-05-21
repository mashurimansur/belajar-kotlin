fun main() {
    val result = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    //Augmented Assigment
    var total: Int = 0
    val barang1 = 100
    total += barang1 //jadi tidak perlu lagi menggunakana total = total + barang1, jadi lebih singkat kan? ahahaha
    val barang2 = 20
    total += barang2
    val barang3 = 50
    total += barang3

    //unary operator
    total++ //total = total + 1
    total-- //total = total - 1
    println(total)
}