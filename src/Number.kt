fun main() {
    //type data number
    var age: Int = 23
    println(age)

    //type data float, tipe data float harus dikasi "F" dibagian akhir supaya dibaca sebagai float kalau tidak maka tipe datanya akan dibaca double
    var sample: Float = 10.1F
    println(sample)

    //Type data literal, untuk data binary harus dikasi "0b" di awal supaya di baca sebagai data binary
    var binary: Int = 0b0101010101
    println(binary)

    //Conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    println(byte)

    var long: Long = number.toLong()
    println(long)
}