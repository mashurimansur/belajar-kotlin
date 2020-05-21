const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    // var untuk variable mutable yang artinya datanya bisa di ubah
    // val untuk variable immutable yang artinya datanya tidak bisa di ubah
    var firstName = "Hury"
    val lastName = "Mansur"
    firstName = "Mashuri"
    println(firstName)
    println(lastName)

    //data Nullable
    //degan memberikan tanda tanya pada bagian tipe datanya
    //Cara ini tidak direkomendasikan
    var name: String? = null
    name = "Hury"
    println(name)
    println(name?.length)

    //Constant
    //adalah immutable data yang bisa di akses untuk keperluan global, bisa di akses di manapun
    //untuk menandai variabel tersebut adalah const, biasanya menggunakan UPPER_CASE dalam pembuatan nama variable constantnya
    // penuylisan const wajib menggunakan val
    println("$APPLICATION : $VERSION")
}