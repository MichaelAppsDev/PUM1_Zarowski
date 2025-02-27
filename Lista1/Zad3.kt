fun Pascal(height: Int): String {
    val trojkat = mutableListOf<List<Int>>()

    for (i in 0 until height) {
        val rzad = MutableList(i + 1) { 1 }  // Inicjalizacja wiersza z 1
        for (j in 1 until i) {
            rzad[j] = trojkat[i - 1][j - 1] + trojkat[i - 1][j]
        }
        trojkat.add(rzad)
    }

    val result = StringBuilder()
    for (rzad in trojkat) {
        val spaces = " ".repeat(height - rzad.size)  // Dodawanie spacji przed każdym wierszem
        result.append(spaces)
        result.append(rzad.joinToString(" "))
        result.append("\n")
    }

    return result.toString()
}

fun main() {
    println("Podaj wysokość trójkąta Pascala: ")
    val wysokosc: Int = readln().toInt()
    println(Pascal(wysokosc))
}
