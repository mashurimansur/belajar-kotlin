//inline function adalah kemampuan di kotlin yang mengubah higher-order function menjadi inline function
//dimana dengan inline function, code di dalam higher-order function akan di duplicate agar pada satt runtime, aplikasi tidak perlu membuat objek lambda berulang-ulang
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

//noinline
//saat menandai bahawa function adalah inline, maka secara otomatis semua parameter akan menjadi inline
//jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter, kita bisa menandai parameter tersebut dengan kata kunci noinline
inline fun hello2(
        firstName: () -> String,
        noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    //inline
    println(hello { "Hury" })
    println(hello { "Mansur" })

    //inline dan noinline
    for (i in 0..100) {
        println(hello2({"Hury"}, {"Mansur"}))
    }
}