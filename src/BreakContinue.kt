fun main() {
    //break digunakan untuk menghentikan seluruh perulangan
    //continue digunakan untuk menghentikan perulangan pada saat kondisi terpenuhi dan kembali meneruskan perulangannya
    var i = 0
    while (true) {
        println("Hello ke $i")
        i++
        if (i > 100) {
            break
        }
    }

    for (i in 1..1000){
        if (i % 2 == 0) {
            continue
        }
        println("Angka $i")
    }
}