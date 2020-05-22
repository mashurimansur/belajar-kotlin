fun main() {
    val nilai = "D"
    when (nilai) {
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Try Again")
        }
    }

    //when exression multiple option
    when (nilai) {
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Anda tidak Lulus")
        }
    }

    //when expression In
    val passValue = arrayOf("A", "B", "C")
    when (nilai) {
        in passValue -> println("Selamat anda lulus")
        !in passValue -> println("Anda Tidak Lulus")
    }

    //when expression Is untuk mengecek tipe datanya
    val name = "Hury"
    when (name) {
        is String -> println("Ini adalah string")
        !is String -> println("Ini bukan string")
    }

    //when penggnati if
    val nilaiUjian = 91
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 70 -> println("Good")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Bad")
    }
}