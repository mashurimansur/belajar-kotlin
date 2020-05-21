fun main() {
    var firstName: String = "Hury"
    var lastName: String = "Mansur"

    //tanda petik 2 tiga kali digunakan untuk teks yang berbaris baris
    var address: String = """
        |Jln. BTN Bina Sarana Residence,
        |Maros,
        |Sulawesi Selatan
    """.trimMargin()

    //menggabungkan string
    //var fullname: String = firstName + " " + lastName
    var fullName: String = "$firstName $lastName"
    var desc: String = "$fullName panjangnya adalah ${fullName.length}"

    println(fullName)
    println(desc)
    println(firstName)
    println(lastName)
    println(address)
}