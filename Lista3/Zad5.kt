fun evenPositiveSquare(lst: List<Int>): List<Int> {
    return lst.withIndex() 
        .filter { (index, value) -> index % 2 != 0 && value > 0 } 
        .map { (_, value) -> value * value } 
}

fun main() {
    println(evenPositiveSquare(listOf(1, 2, 3, 5, -6, -1, -1, 2, 3))) // [4, 25, 4]
}
