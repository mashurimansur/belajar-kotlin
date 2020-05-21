fun main() {
    //range
    //operasi range
    //count() = untuk mendapatkan total data di range
    //cointains(value) = mengecek apakah terdapat value tersebut
    //first = mendapatkan nilai pertama
    //last = mendapatkan nilai terakhir
    //step = mendapatkan nilai tiap kenaikan

    //val range = 1..100
    //untuk range terbalik menggunakan downTo
    val range = 100 downTo 1 step 2

    println(range.count())
    println(range.contains(20))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}