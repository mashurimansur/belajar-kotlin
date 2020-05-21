fun main() {
    //tipe data dimasukkan setelah deklarasi array dengan menggunakan tanda "<typedata>"
    //array dengan tipe data string
    val names: Array<String> = arrayOf("Hury", "Ikbal", "Deni")
    val huri: String = names[0]
    val ikbal: String = names[1]
    val deni: String = names[2]

    println(huri)
    println(ikbal)
    println(deni)

    //update array
    names[2] = "Enal"
    println(names[2])

    //array dengan tipe data integer
    val nilai: Array<Int> = arrayOf(10, 20, 40)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //array dengan null menggunakan arrayOFNulls dengan mengisi panjang datanyna
    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Hury"
    members[1] = null
    members[2] = "Jumardi"
    members[3] = "Mansur"
    members[4] = "Muna"
    println(members[1])
}