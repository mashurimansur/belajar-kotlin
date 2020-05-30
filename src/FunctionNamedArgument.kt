fun fullName(firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    //ini adalah default parameter function
    fullName("Hury", "Mansur", "Muna")

    //ini adalah function named argument
    //jadi bisa menyebutkan variable nya diikuti dengan nilainya, jadi bisa tertukar  tukar posisinya
    fullName(firstName = "Hury", middleName = "Mansur", lastName = "Muna")
}