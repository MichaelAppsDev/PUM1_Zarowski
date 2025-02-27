fun CzyPalindrom(slowo: String) {
    val slowo = slowo.lowercase()
    val dlugosc = slowo.length

    for (i in 0 until dlugosc / 2) {
        if (slowo[i] != slowo[dlugosc - 1 - i]) {
            println("Nie jest palindromem")
            return
        }
    }

    println("Jest palindromem")
}

fun main() {
    println("Podaj slowo: ")
    val Slowo = readln()

    CzyPalindrom(Slowo)
}
