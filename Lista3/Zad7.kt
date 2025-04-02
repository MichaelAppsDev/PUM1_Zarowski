fun srt(words: List<String>): List<Pair<Char, List<String>>> {
    return words.filter { it.length % 2 == 0 }
        .groupBy { it.first() } 
        .map { it.key to it.value }
        .sortedBy { it.first }
}

fun main() {
    val words = listOf("apple", "banana", "cherry", "date", "elderberry", "fig", "grape")
    println("Posortowane grupy: " + srt(words))
}
