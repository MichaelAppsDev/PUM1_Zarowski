fun findDuplicates(Lst: List<Int>): List<Int> {
    val duplicates = mutableListOf<Int>()
    for (i in 0 until Lst.size) {
        for (j in i + 1 until Lst.size) {
            if (Lst[i] == Lst[j]) {
                if (!duplicates.contains(Lst[i])) {
                    duplicates += Lst[i]
                }
            }
        }
    }
    return duplicates.sorted()
}

fun main() {
    val Lst = listOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9)
    println(findDuplicates(Lst)) // [5, 9]
}