//label adalah penanda
//semua expression di kotlin bisa ditandai dengan label
//untuk membuat label di kotlin, cukup menggunakan nama label diikuti dengan karakter @, ingat label nggak boleh ada spasi jadi harus satu kata

fun contohLabelBreak() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun contohLabelContinue() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun main() {
    fun test(name: String, operation:(String) -> Unit): Unit = operation(name)

    test("Hury") test@{
        if (it == "") {
            return@test
        } else {
            println("Hury")
        }
    }
}