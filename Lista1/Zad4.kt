fun isPerfect(number: Int): String {
    // Obliczanie sumy dzielników właściwych
    val sumOfDivisors = (1 until number).filter { number % it == 0 }.sum()

    // Klasyfikacja liczby
    return when {
        sumOfDivisors == number -> "Doskonala"  // Doskonała
        sumOfDivisors > number -> "Obfita"  // Obfita
        else -> "Niedomiarowa"                   // Niedomiarowa
    }
}

fun main() {
    val number1 = 28
    println(isPerfect(number1))  // >> Doskonała

    val number2 = 12
    println(isPerfect(number2))  // >> Obfita

    val number3 = 8
    println(isPerfect(number3))  // >> Niedomiarowa
}
