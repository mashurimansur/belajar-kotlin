fun main() {
    // && = dan
    // || = atau
    // ! = negasi/kebalikan
    val nilaiUjian = 80
    val nilaiAbsen = 60
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)
}