fun main() {
    //perulangan pada array
    val names = arrayOf("Hury", "Iqbal", "Jumardi")
    for (name in names) {
        println(name)
    }

    //kita juga bisa melakukan perulangan pada range
    for (i in 0..100 step 2) {
        println(i)
    }

    for (i in 1000 downTo 1 step 50) {
        println(i)
    }

    val ukuraName = names.size - 1
    for (i in 0..ukuraName) {
        println("Index ke $i adalah ${names[i]}")
    }
}