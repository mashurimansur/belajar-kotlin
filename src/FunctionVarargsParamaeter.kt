//varargs wajib berada di variable terakhir atau paling belakang
//varargs sebenarnya adalah array of int
fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0
    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    val result = hitungTotal("Hury", 10, 10, 10, 10, 10, 10, 10)
    println(result)
}