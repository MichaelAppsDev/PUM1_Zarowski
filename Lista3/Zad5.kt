fun evenPositiveSquare(lst: List<Int>): List<Int> {
    return lst.withIndex() // Przekształcamy listę w indeksowane wartości (index, value)
        .filter { (index, value) -> index % 2 != 0 && value > 0 } // Wybieramy tylko elementy na nieparzystych indeksach i dodatnie
        .map { (_, value) -> value * value } // Podnosimy je do kwadratu
}

fun main() {
    println(evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3))) // [4, 25, 4]
}
